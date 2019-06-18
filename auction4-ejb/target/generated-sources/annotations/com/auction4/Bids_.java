package com.auction4;

import com.auction4.Items;
import com.auction4.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-31T01:16:02")
@StaticMetamodel(Bids.class)
public class Bids_ { 

    public static volatile SingularAttribute<Bids, Items> itemid;
    public static volatile SingularAttribute<Bids, Date> dateAndTime;
    public static volatile SingularAttribute<Bids, Users> userid;
    public static volatile SingularAttribute<Bids, Integer> bidid;
    public static volatile SingularAttribute<Bids, Double> bidPrice;

}