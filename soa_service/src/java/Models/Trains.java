/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author dell pc
 */
//@XmlRootElement
public class Trains
{

    private int train_no;
    private String train_name;
    private String arr_time;
    private String dept_time;

    public Trains()
    {

    }

    public Trains(int train_no, String train_name, String arr_time, String dept_time)
    {
        this.train_no = train_no;
        this.train_name = train_name;
        this.arr_time = arr_time;
        this.dept_time = dept_time;
    }

    /**
     * @return the train_no
     */
    public int getTrain_no()
    {
        return train_no;
    }

    /**
     * @param train_no the train_no to set
     */
    public void setTrain_no(int train_no)
    {
        this.train_no = train_no;
    }

    /**
     * @return the train_name
     */
    public String getTrain_name()
    {
        return train_name;
    }

    /**
     * @param train_name the train_name to set
     */
    public void setTrain_name(String train_name)
    {
        this.train_name = train_name;
    }

    /**
     * @return the arr_time
     */
    public String getArr_time()
    {
        return arr_time;
    }

    /**
     * @param arr_time the arr_time to set
     */
    public void setArr_time(String arr_time)
    {
        this.arr_time = arr_time;
    }

    /**
     * @return the dept_time
     */
    public String getDept_time()
    {
        return dept_time;
    }

    /**
     * @param dept_time the dept_time to set
     */
    public void setDept_time(String dept_time)
    {
        this.dept_time = dept_time;
    }
}
