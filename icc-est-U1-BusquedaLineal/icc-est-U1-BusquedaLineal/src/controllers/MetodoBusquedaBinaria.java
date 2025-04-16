package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodoBusquedaBinaria {
    private  Persona[] person;
    private  ShowConsole pantalla; 
    
    
    public MetodoBusquedaBinaria(Persona[] person){
        this.person= person;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodo de busqueda binaria");

    }
    private int findPersonByCode(int code){
        int bajo = 0;
        int alto =person.length-1;

        while(alto>bajo){
            int central = (alto+bajo)/2;

            if(person[central].getCode() ==code){
                return central;
            } 

            if(person[central].getCode()<code){
                alto = central-1;

            }else{
                bajo = central+1;         //Para no usar central
            } 

        }
        return -1;
    }
    
    public void showPersonByCode(){
        int codeToFind = pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson==-1){
            pantalla.showMessage(" Persona con codigo "+codeToFind+" no encontrada ");
            pantalla.showMessage(person[indexPerson].toString());
        } 
    } 

    public void showPersonByName(){
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if(indexPerson==-1){
            pantalla.showMessage(" Persona con nombre "+nameToFind+" no encontrada ");
            pantalla.showMessage(person[indexPerson].toString());
        }
        
    }

    public void ordenarBurbuja(){
        for(int i=0;i<person.length;i++){
            for(int j=i+1;person.length;j++){
                if(person[i])
            }
        }
    }
    

    private int findPersonByName(String name){
        int bajo = 0;
        int alto = person.length-1;
        while (alto>=bajo) {
            int central = (alto+bajo)/2;
        
            if(person[0].getName().equals(name)){
            return central;
            } 
            if(person[0].getName().compareTo(name)>0){
                alto=central-1;
            }else{
                bajo = central+1;
            }
        }
        return -1;    
                     
    }
     
    


}
