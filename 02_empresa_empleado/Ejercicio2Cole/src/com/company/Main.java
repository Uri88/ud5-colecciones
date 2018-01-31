package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        List<Empresa> empresaList = new ArrayList<>();

        int opcion;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Menu\n" +
                    "---------\n" +
                    "1. Crear nueva empresa.\n" +
                    "2. Añadir empleado a empresa ya existente.\n" +
                    "3. Listado de empresas.\n" +
                    "4. Listado detallado de empresas y empleados.\n" +
                    "5. Salir\n" +
                    "Elige una opcion:");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {

                case 1:

                    System.out.print("Introduce un nombre de Empresa: ");
                    String nombreEmpre = br.readLine();

                    System.out.print("Introduce un año de fundacion de la Empresa: ");
                    String anyofundacion = br.readLine();

                    Empresa empresa = new Empresa(nombreEmpre, anyofundacion);

                    empresaList.add(empresa);

                    System.out.println();
                    System.out.println("Empresa introducida");
                    System.out.println("**************");

                    break;

                case 2:

                    //Sacar listado de Empresas existentes

                    for (int i = 0; i < empresaList.size(); i++) {
                        System.out.println(i + " " + empresaList.get(i).getNombre());
                        System.out.println("~~~~~~~~~~");
                    }

                    System.out.print("A que numero de Empresa deseas añadirlo?: ");
                    int numEmpre = Integer.parseInt(br.readLine());

                    System.out.println();

                    System.out.print("Introduce un nombre para el Empleado: ");
                    String nombreEmple = br.readLine();

                    System.out.print("Introduce apellidos para el Empleado: ");
                    String apellidoEmple = br.readLine();

                    System.out.print("Introduce una fecha de nacimiento para el Empleado: ");
                    String fechaNacimientoEmple = br.readLine();

                    System.out.print("Introduce una fecha de contrato para el Empleado: ");
                    String fechaContratoEmpleado = br.readLine();

                    Empleado empleado = new Empleado(nombreEmple, apellidoEmple, fechaNacimientoEmple, fechaContratoEmpleado);

                    empresaList.get(numEmpre).getEmpleadoList().add(empleado);
                    empleado.setEmpresa(empresaList.get(numEmpre));

                    System.out.println("Usuario introducido");
                    System.out.println("**************");
                    break;

                case 3:

                    System.out.println("Listado de Empresas: ");

                    for (Empresa emp: empresaList) {
                        System.out.println(emp);
                    }
/*
                    for (int i = 0; i < empresaList.size(); i++) {
                        System.out.println(empresaList.get(i).getNombre());
                        System.out.println("~~~~~~~~~~");
                    }*/

                    break;

                case 4:

                    System.out.println("Listado de Empleados: ");

                    for (Empresa ee : empresaList) {
                        System.out.println(ee);
                        for (Empleado em : ee.getEmpleadoList()) {
                            System.out.println(em);
                        }
                    }

                    System.out.println("............");




                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("No has introducido una opcion valida...");

            }

            System.out.println("---------------\n");
        } while (opcion != 5);

        System.out.println("FIN");

    }
}
