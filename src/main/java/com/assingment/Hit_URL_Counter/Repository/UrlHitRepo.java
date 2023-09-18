package com.assingment.Hit_URL_Counter.Repository;

import com.assingment.Hit_URL_Counter.Entity.UrlHitCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UrlHitRepo {

    @Autowired
    private List<UrlHitCounter> urlHit;

    public List<UrlHitCounter> getUrlHitCounter()
    {
        return  urlHit;
    }

    public void addUsers(UrlHitCounter u)
    {
        urlHit.add(u);
    }
}
