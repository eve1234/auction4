package com.auction4.entities;

import com.auction4.entities.BuyerItemRatingsAndReviews;
import com.auction4.entities.FeedBacks;
import com.auction4.entities.Items;
import com.auction4.entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-01T00:06:31")
@StaticMetamodel(SoldItems.class)
public class SoldItems_ { 

    public static volatile SingularAttribute<SoldItems, Items> itemid;
    public static volatile ListAttribute<SoldItems, BuyerItemRatingsAndReviews> buyerItemRatingsAndReviewsList;
    public static volatile SingularAttribute<SoldItems, Date> dateAndTimeWhenItemSold;
    public static volatile ListAttribute<SoldItems, FeedBacks> feedBacksList;
    public static volatile SingularAttribute<SoldItems, Users> userid;
    public static volatile SingularAttribute<SoldItems, Integer> soldItemid;

}