package com.example.java21.sample;

public class user {
 private int id;
 private int custid;
public user(int i, int j) {
this.id=i;
this.custid=j;
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
@Override
public String toString() {
	return "user [id=" + id + ", custid=" + custid + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
