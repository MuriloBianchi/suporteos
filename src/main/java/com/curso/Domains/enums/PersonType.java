package com.curso.Domains.enums;

public enum PersonType {
// Enum do Tipo Pessoa
ADMIN(0,"Role_Admins"), USERS(1, "ROle_USERS"), TECHNICIAN(2, "ROLE_TECHNICIAN");

private Integer id;
private String personType;

// Construtor
private PersonType(Integer id, String personType) {
    this.id = id;
    this.personType = personType;
}

// Get e Setter
public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getPersonType() {
    return personType;
}

public void setPersonType(String personType) {
    this.personType = personType;
}

// Metodo Statico para não ser necessario instaciar o enum
// Procura o id nos valores do enum e retornar o resultado
public static PersonType toEnum(Integer id){
    if (id==null) return null; 
    for(PersonType x : PersonType.values()){
        if(id.equals(x.getId())){
            return x;
        }
    }   
    throw new IllegalArgumentException("Perfil invalido");
}

}
