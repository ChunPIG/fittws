package com.fitt.web.fittws.base.form;

import java.util.List;

import com.fitt.web.fittws.base.model.Paginator;

/**
 * baseForm 表单参数
 * <p> Description	: BaseForm.java </p>
 * <p> Copyright	: Copyright (c) 2016 by PCI-SUNTEK</p>
 * <p> Author 		: ZCCHUN </p>
 * <p> Create		: 2016年1月20日 上午9:18:42 </p> 
 * <p> version 		: 1.0 </p>
 */
public class BaseForm {

	private Paginator paginator;
	private boolean showCondition;

	/**
	 * 设置Where条件
	 */
	public void setWhere() {
	}

	/**
	 * 设置Where条件
	 * @param where
	 */
	public void setWhere(List<Object> where) {
	}
	
	public boolean isShowCondition() {
		return showCondition;
	}

	public void setShowCondition(boolean showCondition) {
		this.showCondition = showCondition;
	}

	public Paginator getPaginator() {
		return paginator;
	}

	public void setPaginator(Paginator paginator) {
		this.paginator = paginator;
	}
}
