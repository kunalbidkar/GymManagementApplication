package com.xpanxion.DAO;

import java.util.List;

import com.xpanxion.model.Duration;
import com.xpanxion.model.*;
public interface DurationDao {

	public void addDuration(Duration duration);

	public List<Duration> listDuration();
	
	public void deleteDuration(Duration duration);
}
