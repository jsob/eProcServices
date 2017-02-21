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

package tj.spisok.tovarov.vremenno.service.base;

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

import tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno;
import tj.spisok.tovarov.vremenno.service.persistence.spisok_tovarov_vremennoPersistence;
import tj.spisok.tovarov.vremenno.service.spisok_tovarov_vremennoService;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the spisok_tovarov_vremenno remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.spisok.tovarov.vremenno.service.impl.spisok_tovarov_vremennoServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.spisok.tovarov.vremenno.service.impl.spisok_tovarov_vremennoServiceImpl
 * @see tj.spisok.tovarov.vremenno.service.spisok_tovarov_vremennoServiceUtil
 * @generated
 */
public abstract class spisok_tovarov_vremennoServiceBaseImpl
	extends BaseServiceImpl implements spisok_tovarov_vremennoService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.spisok.tovarov.vremenno.service.spisok_tovarov_vremennoServiceUtil} to access the spisok_tovarov_vremenno remote service.
	 */

	/**
	 * Returns the spisok_tovarov_vremenno local service.
	 *
	 * @return the spisok_tovarov_vremenno local service
	 */
	public tj.spisok.tovarov.vremenno.service.spisok_tovarov_vremennoLocalService getspisok_tovarov_vremennoLocalService() {
		return spisok_tovarov_vremennoLocalService;
	}

	/**
	 * Sets the spisok_tovarov_vremenno local service.
	 *
	 * @param spisok_tovarov_vremennoLocalService the spisok_tovarov_vremenno local service
	 */
	public void setspisok_tovarov_vremennoLocalService(
		tj.spisok.tovarov.vremenno.service.spisok_tovarov_vremennoLocalService spisok_tovarov_vremennoLocalService) {
		this.spisok_tovarov_vremennoLocalService = spisok_tovarov_vremennoLocalService;
	}

	/**
	 * Returns the spisok_tovarov_vremenno remote service.
	 *
	 * @return the spisok_tovarov_vremenno remote service
	 */
	public spisok_tovarov_vremennoService getspisok_tovarov_vremennoService() {
		return spisok_tovarov_vremennoService;
	}

	/**
	 * Sets the spisok_tovarov_vremenno remote service.
	 *
	 * @param spisok_tovarov_vremennoService the spisok_tovarov_vremenno remote service
	 */
	public void setspisok_tovarov_vremennoService(
		spisok_tovarov_vremennoService spisok_tovarov_vremennoService) {
		this.spisok_tovarov_vremennoService = spisok_tovarov_vremennoService;
	}

	/**
	 * Returns the spisok_tovarov_vremenno persistence.
	 *
	 * @return the spisok_tovarov_vremenno persistence
	 */
	public spisok_tovarov_vremennoPersistence getspisok_tovarov_vremennoPersistence() {
		return spisok_tovarov_vremennoPersistence;
	}

	/**
	 * Sets the spisok_tovarov_vremenno persistence.
	 *
	 * @param spisok_tovarov_vremennoPersistence the spisok_tovarov_vremenno persistence
	 */
	public void setspisok_tovarov_vremennoPersistence(
		spisok_tovarov_vremennoPersistence spisok_tovarov_vremennoPersistence) {
		this.spisok_tovarov_vremennoPersistence = spisok_tovarov_vremennoPersistence;
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
		return spisok_tovarov_vremennoService.class.getName();
	}

	protected Class<?> getModelClass() {
		return spisok_tovarov_vremenno.class;
	}

	protected String getModelClassName() {
		return spisok_tovarov_vremenno.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = spisok_tovarov_vremennoPersistence.getDataSource();

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

	@BeanReference(type = tj.spisok.tovarov.vremenno.service.spisok_tovarov_vremennoLocalService.class)
	protected tj.spisok.tovarov.vremenno.service.spisok_tovarov_vremennoLocalService spisok_tovarov_vremennoLocalService;
	@BeanReference(type = spisok_tovarov_vremennoService.class)
	protected spisok_tovarov_vremennoService spisok_tovarov_vremennoService;
	@BeanReference(type = spisok_tovarov_vremennoPersistence.class)
	protected spisok_tovarov_vremennoPersistence spisok_tovarov_vremennoPersistence;
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