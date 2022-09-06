package enitity;

import service.UserService;


public class User implements UserService {
    public String name_user;
    public String data;
    public String work_place;
    public double income;
    public String banks;
    public int credit_accounts;
    public int payment_accounts;
    public int credit_rating;

    public User(String name_user, String data, String work_place,double income, String banks,int credit_accounts,
    int payment_accounts,int credit_rating ) {
        this.name_user=name_user;
        this.data=data;
        this.work_place=work_place;
        this.income=income;
        this.banks=banks;
        this.credit_accounts=credit_accounts;
        this.payment_accounts=payment_accounts;
        this.credit_rating=credit_rating;
    }

    public void add_user(){

    }



}



