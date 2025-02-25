package com.mypack;

public class Book {
 int bid;
 String bname,bauthor,bcategory;
 float bvalue;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getBauthor() {
	return bauthor;
}
public void setBauthor(String bauthor) {
	this.bauthor = bauthor;
}
public String getBcategory() {
	return bcategory;
}
public void setBcategory(String bcategory) {
	this.bcategory = bcategory;
}
public float getBprice() {
	return bvalue;
}
public void setBprice(float bprice) {
	this.bvalue = bprice;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + ", bcategory=" + bcategory + ", bprice="
			+ bvalue + "]";
}
 

}
