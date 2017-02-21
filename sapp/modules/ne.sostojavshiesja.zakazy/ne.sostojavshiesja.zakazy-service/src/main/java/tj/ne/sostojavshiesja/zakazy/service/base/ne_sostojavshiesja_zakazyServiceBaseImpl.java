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

package tj.ne.sostojavshiesja.zakazy.service.base;

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

import tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy;
import tj.ne.sostojavshiesja.zakazy.service.ne_sostojavshiesja_zakazyService;
import tj.ne.sostojavshiesja.zakazy.service.persistence.ne_sostojavshiesja_zakazyPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the ne_sostojavshiesja_zakazy remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.ne.sostojavshiesja.zakazy.service.impl.ne_sostojavshiesja_zakazyServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.ne.sostojavshiesja.zakazy.service.impl.ne_sostojavshiesja_zakazyServiceImpl
 * @see tj.ne.sostojavshiesja.zakazy.service.ne_sostojavshiesja_zakazyServiceUtil
 * @generated
 */
public abstract class ne_sostojavshiesja_zakazyServiceBaseImpl
	extends BaseServiceImpl implements ne_sostojavshiesja_zakazyService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.ne.sostojavshiesja.zakazy.service.ne_sostojavshiesja_zakazyServiceUtil} to access the ne_sostojavshiesja_zakazy remote service.
	 */

	/**
	 * Returns the ne_sostojavshiesja_zakazy local service.
	 *
	 * @return the ne_sostojavshiesja_zakazy local service
	 */
	public tj.ne.sostojavshiesja.zakazy.service.ne_sostojavshiesja_zakazyLocalService getne_sostojavshiesja_zakazyLocalService() {
		return ne_sostojavshiesja_zakazyLocalService;
	}

	/**
	 * Sets the ne_sostojavshiesja_zakazy local service.
	 *
	 * @param ne_sostojavshiesja_zakazyLocalService the ne_sostojavshiesja_zakazy local service
	 */
	public void setne_sostojavshiesja_zakazyLocalService(
		tj.ne.sostojavshiesja.zakazy.service.ne_sostojavshiesja_zakazyLocalService ne_sostojavshiesja_zakazyLocalService) {
		this.ne_sostojavshiesja_zakazyLocalService = ne_sostojavshiesja_zakazyLocalService;
	}

	/**
	 * Returns the ne_sostojavshiesja_zakazy remote service.
	 *
	 * @return the ne_sostojavshiesja_zakazy remote service
	 */
	public ne_sostojavshiesja_zakazyService getne_sostojavshiesja_zakazyService() {
		return ne_sostojavshiesja_zakazyService;
	}

	/**
	 * Sets the ne_sostojavshiesja_zakazy remote service.
	 *
	 * @param ne_sostojavshiesja_zakazyService the ne_sostojavshiesja_zakazy remote service
	 */
	public void setne_sostojavshiesja_zakazyService(
		ne_sostojavshiesja_zakazyService ne_sostojavshiesja_zakazyService) {
		this.ne_sostojavshiesja_zakazyService = ne_sostojavshiesja_zakazyService;
	}

	/**
	 * Returns the ne_sostojavshiesja_zakazy persistence.
	 *
	 * @return the ne_sostojavshiesja_zakazy persistence
	 */
	public ne_sostojavshiesja_zakazyPersistence getne_sostojavshiesja_zakazyPersistence() {
		return ne_sostojavshiesja_zakazyPersistence;
	}

	/**
	 * Sets the ne_sostojavshiesja_zakazy persistence.
	 *
	 * @param ne_sostojavshiesja_zakazyPersistence the ne_sostojavshiesja_zakazy persistence
	 */
	public void setne_sostojavshiesja_zakazyPersistence(
		ne_sostojavshiesja_zakazyPersistence ne_sostojavshiesja_zakazyPersistence) {
		this.ne_sostojavshiesja_zakazyPersistence = ne_sostojavshiesja_zakazyPersistence;
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
		return ne_sostojavshiesja_zakazyService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ne_sostojavshiesja_zakazy.class;
	}

	protected String getModelClassName() {
		return ne_sostojavshiesja_zakazy.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = ne_sostojavshiesja_zakazyPersistence.getDataSource();

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

	@BeanReference(type = tj.ne.sostojavshiesja.zakazy.service.ne_sostojavshiesja_zakazyLocalService.class)
	protected tj.ne.sostojavshiesja.zakazy.service.ne_sostojavshiesja_zakazyLocalService ne_sostojavshiesja_zakazyLocalService;
	@BeanReference(type = ne_sostojavshiesja_zakazyService.class)
	protected ne_sostojavshiesja_zakazyService ne_sostojavshiesja_zakazyService;
	@BeanReference(type = ne_sostojavshiesja_zakazyPersistence.class)
	protected ne_sostojavshiesja_zakazyPersistence ne_sostojavshiesja_zakazyPersistence;
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