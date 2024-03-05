package com.curso.Domains.enums;

public enum OrderPriority {
LOW(0, "ROLE_LOW"), MEDIUM(1, "ROLE_MEDIUM"), HIGH(2, "ROLE_HIGH");

private Integer id;
private String orderPriority;


private OrderPriority(Integer id, String orderPriority) {
    this.id = id;
    this.orderPriority = orderPriority;
}


public Integer getId() {
    return id;
}


public void setId(Integer id) {
    this.id = id;
}


public String getOrderPriority() {
    return orderPriority;
}


public void setOrderPriority(String orderPriority) {
    this.orderPriority = orderPriority;
}

public static OrderPriority toEnum(Integer id){
    if(id==null) return null;
    for(OrderPriority x : OrderPriority.values()){
        if(id.equals(x.getId())){
            return x;
        }
    }
    throw new IllegalArgumentException("Ordem invalida");
}

}
