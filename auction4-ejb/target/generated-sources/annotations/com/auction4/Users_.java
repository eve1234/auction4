package com.auction4;

import com.auction4.Bids;
import com.auction4.Items;
import com.auction4.SoldItems;
import com.auction4.TypeOfUsers;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-31T01:16:02")
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