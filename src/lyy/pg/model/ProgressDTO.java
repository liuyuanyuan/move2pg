/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Liu Yuanyuan
 */
public class ProgressDTO
{
	private int value;// for progressBar
	private int totalCount;//total object count
	private int fkCount;// -2 before migrate fck, -1 no fkc , >0 has fck

	private AtomicInteger status;// -1 stop, 0 suspend, 1 run, 2 finish.

	public ProgressDTO()
	{
		value = 0;
		totalCount = 0;
		fkCount = -2;
		
		status = new AtomicInteger(1);
	}

    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
    {
        this.value = value;
    }

    public int getFkCount()
    {
        return fkCount;
    }
    public void setFkCount(int fkCount)
    {
        this.fkCount = fkCount;
    }
    
    public int getTotalCount()
    {
        return totalCount;
    }
    public void setTotalCount(int totalCount)
    {
        this.totalCount = totalCount;
    }
     
    public int getState()
    {
        return status.get();
    }
    public void setState(int state)
    {
        status.set(state);;
    }
    
}
