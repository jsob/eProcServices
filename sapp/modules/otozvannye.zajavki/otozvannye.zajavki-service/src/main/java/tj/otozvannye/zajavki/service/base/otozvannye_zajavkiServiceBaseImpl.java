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

package tj.otozvannye.zajavki.service.base;

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

import tj.otozvannye.zajavki.model.otozvannye_zajavki;
import tj.otozvannye.zajavki.service.otozvannye_zajavkiService;
import tj.otozvannye.zajavki.service.persistence.otozvannye_zajavkiPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the otozvannye_zajavki remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.otozvannye.zajavki.service.impl.otozvannye_zajavkiServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.otozvannye.zajavki.service.impl.otozvannye_zajavkiServiceImpl
 * @see tj.otozvannye.zajavki.service.otozvannye_zajavkiServiceUtil
 * @generated
 */
public abstract class otozvannye_zajavkiServiceBaseImpl extends BaseServiceImpl
	implements otozvannye_zajavkiService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.otozvannye.zajavki.service.otozvannye_zajavkiServiceUtil} to access the otozvannye_zajavki remote service.
	 */

	/**
	 * Returns the otozvannye_zajavki local service.
	 *
	 * @return the otozvannye_zajavki local service
	 */
	public tj.otozvannye.zajavki.service.otozvannye_zajavkiLocalService getotozvannye_zajavkiLocalService() {
		return otozvannye_zajavkiLocalService;
	}

	/**
	 * Sets the otozvannye_zajavki local service.
	 *
	 * @param otozvannye_zajavkiLocalService the otozvannye_zajavki local service
	 */
	public void setotozvannye_zajavkiLocalService(
		tj.otozvannye.zajavki.service.otozvannye_zajavkiLocalService otozvannye_zajavkiLocalService) {
		this.otozvannye_zajavkiLocalService = otozvannye_zajavkiLocalService;
	}

	/**
	 * Returns the otozvannye_zajavki remote service.
	 *
	 * @return the otozvannye_zajavki remote service
	 */
	public otozvannye_zajavkiService getotozvannye_zajavkiService() {
		return otozvannye_zajavkiService;
	}

	/**
	 * Sets the otozvannye_zajavki remote service.
	 *
	 * @param otozvannye_zajavkiService the otozvannye_zajavki remote service
	 */
	public void setotozvannye_zajavkiService(
		otozvannye_zajavkiService otozvannye_zajavkiService) {
		this.otozvannye_zajavkiService = otozvannye_zajavkiService;
	}

	/**
	 * Returns the otozvannye_zajavki persistence.
	 *
	 * @return the otozvannye_zajavki persistence
	 */
	public otozvannye_zajavkiPersistence getotozvannye_zajavkiPersistence() {
		return otozvannye_zajavkiPersistence;
	}

	/**
	 * Sets the otozvannye_zajavki persistence.
	 *
	 * @param otozvannye_zajavkiPersistence the otozvannye_zajavki persistence
	 */
	public void setotozvannye_zajavkiPersistence(
		otozvannye_zajavkiPersistence otozvannye_zajavkiPersistence) {
		this.otozvannye_zajavkiPersistence = otozvannye_zajavkiPersistence;
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
		return otozvannye_zajavkiService.class.getName();
	}

	protected Class<?> getModelClass() {
		return otozvannye_zajavki.class;
	}

	protected String getModelClassName() {
		return otozvannye_zajavki.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = otozvannye_zajavkiPersistence.getDataSource();

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

	@BeanReference(type = tj.otozvannye.zajavki.service.otozvannye_zajavkiLocalService.class)
	protected tj.otozvannye.zajavki.service.otozvannye_zajavkiLocalService otozvannye_zajavkiLocalService;
	@BeanReference(type = otozvannye_zajavkiService.class)
	protected otozvannye_zajavkiService otozvannye_zajavkiService;
	@BeanReference(type = otozvannye_zajavkiPersistence.class)
	protected otozvannye_zajavkiPersistence otozvannye_zajavkiPersistence;
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