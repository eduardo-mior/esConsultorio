package dev.mior.esconsultorio.util;

/**
 *
 * @author Mior
 */
public final class Validar {

    private static final int[] PESO_CPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    private static final int[] PESO_CNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int calcularDigito(String str, int[] peso) {
        int soma = 0;
        for (int indice = str.length() - 1, digito; indice >= 0; indice-- ) {
            digito = Integer.parseInt(str.substring(indice, indice+1));
            soma += digito * peso[peso.length - str.length() + indice];
        }
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }

    private static String padLeft(String text, char character) {
        return String.format("%11s", text).replace(' ', character);
    }

    public static boolean CPF(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "").replace(" ", "");
        if ((cpf == null) || (cpf.length() != 11)) return false;
        for (int j = 0; j < 10; j++)
            if (padLeft(Integer.toString(j), Character.forDigit(j, 10)).equals(cpf))
                return false;

        Integer digito1 = calcularDigito(cpf.substring(0,9), PESO_CPF);
        Integer digito2 = calcularDigito(cpf.substring(0,9) + digito1, PESO_CPF);
        return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
    }

    public static boolean CNPJ(String cnpj) {
        cnpj = cnpj.replace(".", "").replace("-", "").replace(" ", "");
        if ((cnpj == null) || (cnpj.length() != 14)) return false;
        Integer digito1 = calcularDigito(cnpj.substring(0,12), PESO_CNPJ);
        Integer digito2 = calcularDigito(cnpj.substring(0,12) + digito1, PESO_CNPJ);
        return cnpj.equals(cnpj.substring(0,12) + digito1.toString() + digito2.toString());
    }
    
    public static boolean RG(String rg) {
        rg = rg.replace("-", "").replace(" ", "").replace("/", "").replace(" ", "");
        return rg.length() >= 6 && rg.length() <= 10;
    }
    
    public static boolean telefone(String telefone, int digitos) {
        telefone = telefone.replace("(", "").replace(")", "").replace(" ", "");
        return telefone.length() >= digitos;
    }
    
    public static boolean email(String email) {
        return email.trim().matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
    }
    
    public static boolean numero(String numero) {
        numero = numero.replace(" ", "").replace(",", ".");
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean hora(String hora) {
        hora = hora.replace(" ", "").replace(",", ".");
        if (!numero(hora)) return false;
        double numero = Double.parseDouble(hora);
        return numero >= 0 && numero <= 23;
    }
    
    public static boolean minuto(String minuto) {
        minuto = minuto.replace(" ", "").replace(",", ".");
        if (!numero(minuto)) return false;
        double numero = Double.parseDouble(minuto);
        return numero >= 0 && numero <= 59;
    }
    
}