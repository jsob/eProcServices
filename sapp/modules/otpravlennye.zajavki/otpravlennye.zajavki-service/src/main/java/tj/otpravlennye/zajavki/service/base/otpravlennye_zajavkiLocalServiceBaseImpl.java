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

package tj.otpravlennye.zajavki.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.otpravlennye.zajavki.model.otpravlennye_zajavki;
import tj.otpravlennye.zajavki.service.otpravlennye_zajavkiLocalService;
import tj.otpravlennye.zajavki.service.persistence.otpravlennye_zajavkiPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the otpravlennye_zajavki local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.otpravlennye.zajavki.service.impl.otpravlennye_zajavkiLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.otpravlennye.zajavki.service.impl.otpravlennye_zajavkiLocalServiceImpl
 * @see tj.otpravlennye.zajavki.service.otpravlennye_zajavkiLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class otpravlennye_zajavkiLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements otpravlennye_zajavkiLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.otpravlennye.zajavki.service.otpravlennye_zajavkiLocalServiceUtil} to access the otpravlennye_zajavki local service.
	 */

	/**
	 * Adds the otpravlennye_zajavki to the database. Also notifies the appropriate model listeners.
	 *
	 * @param otpravlennye_zajavki the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public otpravlennye_zajavki addotpravlennye_zajavki(
		otpravlennye_zajavki otpravlennye_zajavki) {
		otpravlennye_zajavki.setNew(true);

		return otpravlennye_zajavkiPersistence.update(otpravlennye_zajavki);
	}

	/**
	 * Creates a new otpravlennye_zajavki with the primary key. Does not add the otpravlennye_zajavki to the database.
	 *
	 * @param otpravlennye_zajavki_id the primary key for the new otpravlennye_zajavki
	 * @return the new otpravlennye_zajavki
	 */
	@Override
	public otpravlennye_zajavki createotpravlennye_zajavki(
		long otpravlennye_zajavki_id) {
		return otpravlennye_zajavkiPersistence.create(otpravlennye_zajavki_id);
	}

	/**
	 * Deletes the otpravlennye_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki that was removed
	 * @throws PortalException if a otpravlennye_zajavki with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public otpravlennye_zajavki deleteotpravlennye_zajavki(
		long otpravlennye_zajavki_id) throws PortalException {
		return otpravlennye_zajavkiPersistence.remove(otpravlennye_zajavki_id);
	}

	/**
	 * Deletes the otpravlennye_zajavki from the database. Also notifies the appropriate model listeners.
	 *
	 * @param otpravlennye_zajavki the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public otpravlennye_zajavki deleteotpravlennye_zajavki(
		otpravlennye_zajavki otpravlennye_zajavki) {
		return otpravlennye_zajavkiPersistence.remove(otpravlennye_zajavki);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(otpravlennye_zajavki.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return otpravlennye_zajavkiPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return otpravlennye_zajavkiPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return otpravlennye_zajavkiPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return otpravlennye_zajavkiPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return otpravlennye_zajavkiPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public otpravlennye_zajavki fetchotpravlennye_zajavki(
		long otpravlennye_zajavki_id) {
		return otpravlennye_zajavkiPersistence.fetchByPrimaryKey(otpravlennye_zajavki_id);
	}

	/**
	 * Returns the otpravlennye_zajavki with the primary key.
	 *
	 * @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki
	 * @throws PortalException if a otpravlennye_zajavki with the primary key could not be found
	 */
	@Override
	public otpravlennye_zajavki getotpravlennye_zajavki(
		long otpravlennye_zajavki_id) throws PortalException {
		return otpravlennye_zajavkiPersistence.findByPrimaryKey(otpravlennye_zajavki_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(otpravlennye_zajavkiLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(otpravlennye_zajavki.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"otpravlennye_zajavki_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(otpravlennye_zajavkiLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(otpravlennye_zajavki.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"otpravlennye_zajavki_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(otpravlennye_zajavkiLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(otpravlennye_zajavki.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"otpravlennye_zajavki_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return otpravlennye_zajavkiLocalService.deleteotpravlennye_zajavki((otpravlennye_zajavki)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return otpravlennye_zajavkiPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the otpravlennye_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of otpravlennye_zajavkis
	 * @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	 * @return the range of otpravlennye_zajavkis
	 */
	@Override
	public List<otpravlennye_zajavki> getotpravlennye_zajavkis(int start,
		int end) {
		return otpravlennye_zajavkiPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of otpravlennye_zajavkis.
	 *
	 * @return the number of otpravlennye_zajavkis
	 */
	@Override
	public int getotpravlennye_zajavkisCount() {
		return otpravlennye_zajavkiPersistence.countAll();
	}

	/**
	 * Updates the otpravlennye_zajavki in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param otpravlennye_zajavki the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public otpravlennye_zajavki updateotpravlennye_zajavki(
		otpravlennye_zajavki otpravlennye_zajavki) {
		return otpravlennye_zajavkiPersistence.update(otpravlennye_zajavki);
	}

	/**
	 * Returns the otpravlennye_zajavki local service.
	 *
	 * @return the otpravlennye_zajavki local service
	 */
	public otpravlennye_zajavkiLocalService getotpravlennye_zajavkiLocalService() {
		return otpravlennye_zajavkiLocalService;
	}

	/**
	 * Sets the otpravlennye_zajavki local service.
	 *
	 * @param otpravlennye_zajavkiLocalService the otpravlennye_zajavki local service
	 */
	public void setotpravlennye_zajavkiLocalService(
		otpravlennye_zajavkiLocalService otpravlennye_zajavkiLocalService) {
		this.otpravlennye_zajavkiLocalService = otpravlennye_zajavkiLocalService;
	}

	/**
	 * Returns the otpravlennye_zajavki persistence.
	 *
	 * @return the otpravlennye_zajavki persistence
	 */
	public otpravlennye_zajavkiPersistence getotpravlennye_zajavkiPersistence() {
		return otpravlennye_zajavkiPersistence;
	}

	/**
	 * Sets the otpravlennye_zajavki persistence.
	 *
	 * @param otpravlennye_zajavkiPersistence the otpravlennye_zajavki persistence
	 */
	public void setotpravlennye_zajavkiPersistence(
		otpravlennye_zajavkiPersistence otpravlennye_zajavkiPersistence) {
		this.otpravlennye_zajavkiPersistence = otpravlennye_zajavkiPersistence;
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
		persistedModelLocalServiceRegistry.register("tj.otpravlennye.zajavki.model.otpravlennye_zajavki",
			otpravlennye_zajavkiLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"tj.otpravlennye.zajavki.model.otpravlennye_zajavki");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return otpravlennye_zajavkiLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return otpravlennye_zajavki.class;
	}

	protected String getModelClassName() {
		return otpravlennye_zajavki.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = otpravlennye_zajavkiPersistence.getDataSource();

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

	@BeanReference(type = otpravlennye_zajavkiLocalService.class)
	protected otpravlennye_zajavkiLocalService otpravlennye_zajavkiLocalService;
	@BeanReference(type = otpravlennye_zajavkiPersistence.class)
	protected otpravlennye_zajavkiPersistence otpravlennye_zajavkiPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}