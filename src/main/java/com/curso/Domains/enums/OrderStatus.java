package com.curso.Domains.enums;

public enum OrderStatus {
OPEN(0, "ROLE_OPEN"), PROGRESS(1, "ROLE_PROGRESS"), CLOSED(2, "ROLE_CLOSED");

private Integer id;
private String orderStatus;

private OrderStatus(Integer id, String orderStatus) {
    this.id = id;
    this.orderStatus = orderStatus;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getOrderStatus() {
    return orderStatus;
}

public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
}

public static OrderStatus toEnum(Integer id){
    if(id==null) return null;
    for(OrderStatus x : OrderStatus.values()){
        if(id.equals(x.getId())){
            return x;
        }
    }
    throw new IllegalArgumentException("Ordem invalida");
}

}

