/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.informacija.o.razmewenii.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.informacija.o.razmewenii.model.informacija_o_razmewenii;
import tj.informacija.o.razmewenii.service.informacija_o_razmeweniiService;
import tj.informacija.o.razmewenii.service.persistence.informacija_o_razmeweniiPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the informacija_o_razmewenii remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.informacija.o.razmewenii.service.impl.informacija_o_razmeweniiServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.informacija.o.razmewenii.service.impl.informacija_o_razmeweniiServiceImpl
 * @see tj.informacija.o.razmewenii.service.informacija_o_razmeweniiServiceUtil
 * @generated
 */
public abstract class informacija_o_razmeweniiServiceBaseImpl
	extends BaseServiceImpl implements informacija_o_razmeweniiService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.informacija.o.razmewenii.service.informacija_o_razmeweniiServiceUtil} to access the informacija_o_razmewenii remote service.
	 */

	/**
	 * Returns the informacija_o_razmewenii local service.
	 *
	 * @return the informacija_o_razmewenii local service
	 */
	public tj.informacija.o.razmewenii.service.informacija_o_razmeweniiLocalService getinformacija_o_razmeweniiLocalService() {
		return informacija_o_razmeweniiLocalService;
	}

	/**
	 * Sets the informacija_o_razmewenii local service.
	 *
	 * @param informacija_o_razmeweniiLocalService the informacija_o_razmewenii local service
	 */
	public void setinformacija_o_razmeweniiLocalService(
		tj.informacija.o.razmewenii.service.informacija_o_razmeweniiLocalService informacija_o_razmeweniiLocalService) {
		this.informacija_o_razmeweniiLocalService = informacija_o_razmeweniiLocalService;
	}

	/**
	 * Returns the informacija_o_razmewenii remote service.
	 *
	 * @return the informacija_o_razmewenii remote service
	 */
	public informacija_o_razmeweniiService getinformacija_o_razmeweniiService() {
		return informacija_o_razmeweniiService;
	}

	/**
	 * Sets the informacija_o_razmewenii remote service.
	 *
	 * @param informacija_o_razmeweniiService the informacija_o_razmewenii remote service
	 */
	public void setinformacija_o_razmeweniiService(
		informacija_o_razmeweniiService informacija_o_razmeweniiService) {
		this.informacija_o_razmeweniiService = informacija_o_razmeweniiService;
	}

	/**
	 * Returns the informacija_o_razmewenii persistence.
	 *
	 * @return the informacija_o_razmewenii persistence
	 */
	public informacija_o_razmeweniiPersistence getinformacija_o_razmeweniiPersistence() {
		return informacija_o_razmeweniiPersistence;
	}

	/**
	 * Sets the informacija_o_razmewenii persistence.
	 *
	 * @param informacija_o_razmeweniiPersistence the informacija_o_razmewenii persistence
	 */
	public void setinformacija_o_razmeweniiPersistence(
		informacija_o_razmeweniiPersistence informacija_o_razmeweniiPersistence) {
		this.informacija_o_razmeweniiPersistence = informacija_o_razmeweniiPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return informacija_o_razmeweniiService.class.getName();
	}

	protected Class<?> getModelClass() {
		return informacija_o_razmewenii.class;
	}

	protected String getModelClassName() {
		return informacija_o_razmewenii.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = informacija_o_razmeweniiPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = tj.informacija.o.razmewenii.service.informacija_o_razmeweniiLocalService.class)
	protected tj.informacija.o.razmewenii.service.informacija_o_razmeweniiLocalService informacija_o_razmeweniiLocalService;
	@BeanReference(type = informacija_o_razmeweniiService.class)
	protected informacija_o_razmeweniiService informacija_o_razmeweniiService;
	@BeanReference(type = informacija_o_razmeweniiPersistence.class)
	protected informacija_o_razmeweniiPersistence informacija_o_razmeweniiPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}