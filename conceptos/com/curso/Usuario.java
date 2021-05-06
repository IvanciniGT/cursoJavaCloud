package com.curso;


class Usuario extends Persona{
    private String password;
    
    public boolean checkPassword(String supuesto_password){
        if (supuesto_password.equals(password)) {
            return true;
        }else{
            return false;
        }
    }
    
}