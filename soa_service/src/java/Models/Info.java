/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dell pc
 */
@XmlRootElement
public class Info
{

    private int train_no;
    private String name;
    private int seats_fc;
    private int seats_sc;
    private int seats_tc;

    public int getTrain_no()
    {
        return train_no;
    }

    public void setTrain_no(int train_no)
    {
        this.train_no = train_no;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSeats_fc()
    {
        return seats_fc;
    }

    public void setSeats_fc(int seats_fc)
    {
        this.seats_fc = seats_fc;
    }

    public int getSeats_sc()
    {
        return seats_sc;
    }

    public void setSeats_sc(int seats_sc)
    {
        this.seats_sc = seats_sc;
    }

    public int getSeats_tc()
    {
        return seats_tc;
    }

    public void setSeats_tc(int seats_tc)
    {
        this.seats_tc = seats_tc;
    }

    public Info()
    {

    }

    public Info(int train_no, String name, int seats_fc, int seats_sc, int seats_tc)
    {
        this.train_no = train_no;
        this.name = name;
        this.seats_fc = seats_fc;
        this.seats_sc = seats_sc;
        this.seats_tc = seats_tc;
    }

}
