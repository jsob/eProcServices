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

package tj.ocenka.uchastnikam.v.moment.vskrytija.service.base;

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

import tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija;
import tj.ocenka.uchastnikam.v.moment.vskrytija.service.ocenka_uchastnikam_v_moment_vskrytijaService;
import tj.ocenka.uchastnikam.v.moment.vskrytija.service.persistence.ocenka_uchastnikam_v_moment_vskrytijaPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the ocenka_uchastnikam_v_moment_vskrytija remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.ocenka.uchastnikam.v.moment.vskrytija.service.impl.ocenka_uchastnikam_v_moment_vskrytijaServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.service.impl.ocenka_uchastnikam_v_moment_vskrytijaServiceImpl
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.service.ocenka_uchastnikam_v_moment_vskrytijaServiceUtil
 * @generated
 */
public abstract class ocenka_uchastnikam_v_moment_vskrytijaServiceBaseImpl
	extends BaseServiceImpl
	implements ocenka_uchastnikam_v_moment_vskrytijaService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.ocenka.uchastnikam.v.moment.vskrytija.service.ocenka_uchastnikam_v_moment_vskrytijaServiceUtil} to access the ocenka_uchastnikam_v_moment_vskrytija remote service.
	 */

	/**
	 * Returns the ocenka_uchastnikam_v_moment_vskrytija local service.
	 *
	 * @return the ocenka_uchastnikam_v_moment_vskrytija local service
	 */
	public tj.ocenka.uchastnikam.v.moment.vskrytija.service.ocenka_uchastnikam_v_moment_vskrytijaLocalService getocenka_uchastnikam_v_moment_vskrytijaLocalService() {
		return ocenka_uchastnikam_v_moment_vskrytijaLocalService;
	}

	/**
	 * Sets the ocenka_uchastnikam_v_moment_vskrytija local service.
	 *
	 * @param ocenka_uchastnikam_v_moment_vskrytijaLocalService the ocenka_uchastnikam_v_moment_vskrytija local service
	 */
	public void setocenka_uchastnikam_v_moment_vskrytijaLocalService(
		tj.ocenka.uchastnikam.v.moment.vskrytija.service.ocenka_uchastnikam_v_moment_vskrytijaLocalService ocenka_uchastnikam_v_moment_vskrytijaLocalService) {
		this.ocenka_uchastnikam_v_moment_vskrytijaLocalService = ocenka_uchastnikam_v_moment_vskrytijaLocalService;
	}

	/**
	 * Returns the ocenka_uchastnikam_v_moment_vskrytija remote service.
	 *
	 * @return the ocenka_uchastnikam_v_moment_vskrytija remote service
	 */
	public ocenka_uchastnikam_v_moment_vskrytijaService getocenka_uchastnikam_v_moment_vskrytijaService() {
		return ocenka_uchastnikam_v_moment_vskrytijaService;
	}

	/**
	 * Sets the ocenka_uchastnikam_v_moment_vskrytija remote service.
	 *
	 * @param ocenka_uchastnikam_v_moment_vskrytijaService the ocenka_uchastnikam_v_moment_vskrytija remote service
	 */
	public void setocenka_uchastnikam_v_moment_vskrytijaService(
		ocenka_uchastnikam_v_moment_vskrytijaService ocenka_uchastnikam_v_moment_vskrytijaService) {
		this.ocenka_uchastnikam_v_moment_vskrytijaService = ocenka_uchastnikam_v_moment_vskrytijaService;
	}

	/**
	 * Returns the ocenka_uchastnikam_v_moment_vskrytija persistence.
	 *
	 * @return the ocenka_uchastnikam_v_moment_vskrytija persistence
	 */
	public ocenka_uchastnikam_v_moment_vskrytijaPersistence getocenka_uchastnikam_v_moment_vskrytijaPersistence() {
		return ocenka_uchastnikam_v_moment_vskrytijaPersistence;
	}

	/**
	 * Sets the ocenka_uchastnikam_v_moment_vskrytija persistence.
	 *
	 * @param ocenka_uchastnikam_v_moment_vskrytijaPersistence the ocenka_uchastnikam_v_moment_vskrytija persistence
	 */
	public void setocenka_uchastnikam_v_moment_vskrytijaPersistence(
		ocenka_uchastnikam_v_moment_vskrytijaPersistence ocenka_uchastnikam_v_moment_vskrytijaPersistence) {
		this.ocenka_uchastnikam_v_moment_vskrytijaPersistence = ocenka_uchastnikam_v_moment_vskrytijaPersistence;
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
		return ocenka_uchastnikam_v_moment_vskrytijaService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ocenka_uchastnikam_v_moment_vskrytija.class;
	}

	protected String getModelClassName() {
		return ocenka_uchastnikam_v_moment_vskrytija.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = ocenka_uchastnikam_v_moment_vskrytijaPersistence.getDataSource();

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

	@BeanReference(type = tj.ocenka.uchastnikam.v.moment.vskrytija.service.ocenka_uchastnikam_v_moment_vskrytijaLocalService.class)
	protected tj.ocenka.uchastnikam.v.moment.vskrytija.service.ocenka_uchastnikam_v_moment_vskrytijaLocalService ocenka_uchastnikam_v_moment_vskrytijaLocalService;
	@BeanReference(type = ocenka_uchastnikam_v_moment_vskrytijaService.class)
	protected ocenka_uchastnikam_v_moment_vskrytijaService ocenka_uchastnikam_v_moment_vskrytijaService;
	@BeanReference(type = ocenka_uchastnikam_v_moment_vskrytijaPersistence.class)
	protected ocenka_uchastnikam_v_moment_vskrytijaPersistence ocenka_uchastnikam_v_moment_vskrytijaPersistence;
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