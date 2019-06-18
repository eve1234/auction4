package com.auction4.entities;

import com.auction4.entities.Bids;
import com.auction4.entities.Items;
import com.auction4.entities.SoldItems;
import com.auction4.entities.TypeOfUsers;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-01T00:06:31")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> fname;
    public static volatile SingularAttribute<Users, Integer> mobileNum;
    public static volatile ListAttribute<Users, SoldItems> soldItemsList;
    public static volatile SingularAttribute<Users, TypeOfUsers> typeOfUsersid;
    public static volatile SingularAttribute<Users, String> sname;
    public static volatile ListAttribute<Users, Items> itemsList;
    public static volatile SingularAttribute<Users, String> sex;
    public static volatile ListAttribute<Users, Bids> bidsList;
    public static volatile SingularAttribute<Users, String> profileImage;
    public static volatile SingularAttribute<Users, Integer> userid;

}