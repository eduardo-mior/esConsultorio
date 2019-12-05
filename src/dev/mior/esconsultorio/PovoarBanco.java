/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.mior.esconsultorio;

import dev.mior.esconsultorio.dao.EntityDAO;
import dev.mior.esconsultorio.database.Database;
import dev.mior.esconsultorio.entity.Cliente;
import dev.mior.esconsultorio.entity.Consulta;
import dev.mior.esconsultorio.entity.Consultorio;
import java.util.Date;

/**
 *
 * @author Mior
 */
public class PovoarBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        Database.init();
//        Consultorio consultorio = new Consultorio(null, "Fabiano Consultório Odontológico", "sfabiano", "Axxxxxhiqqu");
        Cliente c1 = new Cliente(null, "Eduardo De Bastiani Mior", "026.960.980-69", "2233445566", "eduardo-mior@hotmail.com", "(54) 991343192", 'M', new Date());
        Cliente c2 = new Cliente(null, "Validador de RG", "379.990.594-96", "1234567", null, "(54) 91312392", 'M', new Date());
        Cliente c3 = new Cliente(null, "RG Verdadeiro", "475.527.999-74", "12345678", null, "(54) 44543192", 'F', new Date());
        Cliente c4 = new Cliente(null, "CRG Real", "384.095.154-36", "123456789", null, "(54) 71233192", 'F', new Date());
        Cliente c5 = new Cliente(null, "Meu RG", "599.124.436-26", "1234567890", null, "(54) 61234192", 'M', new Date());
//        Consulta a1 = new Consulta(null, new Date(), new Date(new Date().getTime() + 10000000L), 1000D, "Branqueamento dentario.", "", c5);
//        Consulta a2 = new Consulta(null, new Date(new Date().getTime() + 10000000L), new Date(new Date().getTime() + 20000000L), 1000D, "Branqueamento dentario.", "", c1);
//        Consulta a3 = new Consulta(null, new Date(new Date().getTime() + 40000000L), new Date(new Date().getTime() + 60000000L), 120D, "Tirar carie.", "", c2);
//        Consulta a4 = new Consulta(null, new Date(new Date().getTime() + 90000000L), new Date(new Date().getTime() + 100000000L), 51D, "Tirar dente de leite.", "", c3);
//        Consulta a5 = new Consulta(null, new Date(new Date().getTime() + 120000000L), new Date(new Date().getTime() + 130000000L), 93D, "Revisão.", "", c4);
//        Consulta a6 = new Consulta(null, new Date(new Date().getTime() + 190000000L), new Date(new Date().getTime() + 210000000L), 18D, "Dentatura revisão.", "", c5);
//        Consulta a7 = new Consulta(null, new Date(new Date().getTime() + 240000000L), new Date(new Date().getTime() + 250000000L), 911D, "Implante.", "", c3);
//        Consulta a8 = new Consulta(null, new Date(new Date().getTime() + 260000000L), new Date(new Date().getTime() + 290000000L), 74D, "Dentatura Ajuste.", "", c2);
//        Consulta a9 = new Consulta(null, new Date(new Date().getTime() + 310000000L), new Date(new Date().getTime() + 330000000L), 750D, "Tirar implante.", "", c1);
//        Consulta a10 = new Consulta(null, new Date(new Date().getTime() + 360000000L), new Date(new Date().getTime() + 400000000L), 250D, "Dente implante.", "", c5);      
//        EntityDAO<Consultorio> daoConsultorio = new EntityDAO<>(Consultorio.class);
        EntityDAO<Cliente> daoCliente = new EntityDAO<>(Cliente.class);
        EntityDAO<Consulta> daoConsulta = new EntityDAO<>(Consulta.class);
//        daoConsultorio.create(consultorio);
        daoCliente.create(c1);
        daoCliente.create(c2);
        daoCliente.create(c3);
        daoCliente.create(c4);
        daoCliente.create(c5);
//        daoConsulta.create(a1);
//        daoConsulta.create(a2);
//        daoConsulta.create(a3);
//        daoConsulta.create(a4);
//        daoConsulta.create(a5);
//        daoConsulta.create(a6);
//        daoConsulta.create(a7);
//        daoConsulta.create(a8);
//        daoConsulta.create(a9);
//        daoConsulta.create(a10);
    }
    
}
