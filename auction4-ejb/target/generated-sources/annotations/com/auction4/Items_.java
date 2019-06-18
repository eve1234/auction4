package com.auction4;

import com.auction4.Bids;
import com.auction4.SoldItems;
import com.auction4.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-31T01:16:02")
@StaticMetamodel(Items.class)
public class Items_ { 

    public static volatile SingularAttribute<Items, String> image;
    public static volatile SingularAttribute<Items, Integer> itemid;
    public static volatile SingularAttribute<Items, String> brandName;
    public static volatile ListAttribute<Items, SoldItems> soldItemsList;
    public static volatile SingularAttribute<Items, String> itemName;
    public static volatile SingularAttribute<Items, String> colour;
    public static volatile SingularAttribute<Items, Date> dateAndTime;
    public static volatile SingularAttribute<Items, String> size;
    public static volatile ListAttribute<Items, Bids> bidsList;
    public static volatile SingularAttribute<Items, Double> buyNowPrice;
    public static volatile SingularAttribute<Items, String> descriptions;
    public static volatile SingularAttribute<Items, Users> userid;

}