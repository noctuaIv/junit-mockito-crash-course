package com.voytovych.order.bo;

import com.voytovych.order.bo.exception.BOException;
import com.voytovych.order.dto.Order;

public interface OrderBO {
	boolean placeOrder(Order order) throws BOException;
	
	boolean cancelOrder(int id)  throws BOException;
	
	boolean deleteOrder(int id)  throws BOException;
}
