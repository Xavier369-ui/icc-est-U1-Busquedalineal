package controllers;

import models.*;
import views.ShowConsole;

public class MetodoBusqueda {
    private ShowConsole showConsole;
    private Persona [] people;
    
    public MetodoBusqueda(Persona[] personas){
        showConsole = new ShowConsole();
        this.people=personas;
        showPerson();
    }
    public int busquedaLineal(int[] arreglo,int valorBuscar){
        for(int i=0; i< arreglo.length;i++){
            if (arreglo[i]==valorBuscar){
                return i;
            }

        }
        return -1;
    }
    public int findPersonaByCode(int code ){
        for(int i=0;i<people.length;i++){
            if(people[i].getCode() ==code){
                return i;
            }
            
        }
        return -1;
    }

    public void showPerson(){
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonaByCode(codeToFind);
        if(indexPerson >=0){
            showConsole.showMessage(" Person con codigo " + codeToFind + " encontrada ");
            //showConsole.showMessage(people[indexPerson].toString());
            showConsole.showMessage(people[indexPerson] + " " );
        }else{
            showConsole.showMessage(" Persona no encontrada ");
        }
    }
    public int findPersonByName(String name){
        for(int i=0;i<people.length;i++){
            if(people[i].getName() == name){
                return i;
            }

        }
        return -1;
    }
    public void showPersonByName(){
        String nameToFinde = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFinde);
        if(indexPerson>=0){
            showConsole.showMessage("Persona de nombre"+nameToFinde+"encontrada");
            showConsole.showMessage(people[indexPerson]+ "");
        }else{
            showConsole.showMessage("Persona no encontada");
        }
    }
    

    

}
