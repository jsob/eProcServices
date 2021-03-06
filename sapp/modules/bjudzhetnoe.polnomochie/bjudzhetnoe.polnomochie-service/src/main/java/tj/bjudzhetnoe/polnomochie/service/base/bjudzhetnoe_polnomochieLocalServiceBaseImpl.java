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

package tj.bjudzhetnoe.polnomochie.service.base;

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

import tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie;
import tj.bjudzhetnoe.polnomochie.service.bjudzhetnoe_polnomochieLocalService;
import tj.bjudzhetnoe.polnomochie.service.persistence.bjudzhetnoe_polnomochiePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the bjudzhetnoe_polnomochie local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.bjudzhetnoe.polnomochie.service.impl.bjudzhetnoe_polnomochieLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.bjudzhetnoe.polnomochie.service.impl.bjudzhetnoe_polnomochieLocalServiceImpl
 * @see tj.bjudzhetnoe.polnomochie.service.bjudzhetnoe_polnomochieLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class bjudzhetnoe_polnomochieLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements bjudzhetnoe_polnomochieLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.bjudzhetnoe.polnomochie.service.bjudzhetnoe_polnomochieLocalServiceUtil} to access the bjudzhetnoe_polnomochie local service.
	 */

	/**
	 * Adds the bjudzhetnoe_polnomochie to the database. Also notifies the appropriate model listeners.
	 *
	 * @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public bjudzhetnoe_polnomochie addbjudzhetnoe_polnomochie(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		bjudzhetnoe_polnomochie.setNew(true);

		return bjudzhetnoe_polnomochiePersistence.update(bjudzhetnoe_polnomochie);
	}

	/**
	 * Creates a new bjudzhetnoe_polnomochie with the primary key. Does not add the bjudzhetnoe_polnomochie to the database.
	 *
	 * @param bjudzhetnoe_polnomochie_id the primary key for the new bjudzhetnoe_polnomochie
	 * @return the new bjudzhetnoe_polnomochie
	 */
	@Override
	public bjudzhetnoe_polnomochie createbjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id) {
		return bjudzhetnoe_polnomochiePersistence.create(bjudzhetnoe_polnomochie_id);
	}

	/**
	 * Deletes the bjudzhetnoe_polnomochie with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie that was removed
	 * @throws PortalException if a bjudzhetnoe_polnomochie with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public bjudzhetnoe_polnomochie deletebjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id) throws PortalException {
		return bjudzhetnoe_polnomochiePersistence.remove(bjudzhetnoe_polnomochie_id);
	}

	/**
	 * Deletes the bjudzhetnoe_polnomochie from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public bjudzhetnoe_polnomochie deletebjudzhetnoe_polnomochie(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		return bjudzhetnoe_polnomochiePersistence.remove(bjudzhetnoe_polnomochie);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(bjudzhetnoe_polnomochie.class,
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
		return bjudzhetnoe_polnomochiePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return bjudzhetnoe_polnomochiePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return bjudzhetnoe_polnomochiePersistence.findWithDynamicQuery(dynamicQuery,
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
		return bjudzhetnoe_polnomochiePersistence.countWithDynamicQuery(dynamicQuery);
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
		return bjudzhetnoe_polnomochiePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public bjudzhetnoe_polnomochie fetchbjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id) {
		return bjudzhetnoe_polnomochiePersistence.fetchByPrimaryKey(bjudzhetnoe_polnomochie_id);
	}

	/**
	 * Returns the bjudzhetnoe_polnomochie with the primary key.
	 *
	 * @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie
	 * @throws PortalException if a bjudzhetnoe_polnomochie with the primary key could not be found
	 */
	@Override
	public bjudzhetnoe_polnomochie getbjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id) throws PortalException {
		return bjudzhetnoe_polnomochiePersistence.findByPrimaryKey(bjudzhetnoe_polnomochie_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(bjudzhetnoe_polnomochieLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(bjudzhetnoe_polnomochie.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"bjudzhetnoe_polnomochie_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(bjudzhetnoe_polnomochieLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(bjudzhetnoe_polnomochie.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"bjudzhetnoe_polnomochie_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(bjudzhetnoe_polnomochieLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(bjudzhetnoe_polnomochie.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"bjudzhetnoe_polnomochie_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return bjudzhetnoe_polnomochieLocalService.deletebjudzhetnoe_polnomochie((bjudzhetnoe_polnomochie)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return bjudzhetnoe_polnomochiePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the bjudzhetnoe_polnomochies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bjudzhetnoe_polnomochies
	 * @param end the upper bound of the range of bjudzhetnoe_polnomochies (not inclusive)
	 * @return the range of bjudzhetnoe_polnomochies
	 */
	@Override
	public List<bjudzhetnoe_polnomochie> getbjudzhetnoe_polnomochies(
		int start, int end) {
		return bjudzhetnoe_polnomochiePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of bjudzhetnoe_polnomochies.
	 *
	 * @return the number of bjudzhetnoe_polnomochies
	 */
	@Override
	public int getbjudzhetnoe_polnomochiesCount() {
		return bjudzhetnoe_polnomochiePersistence.countAll();
	}

	/**
	 * Updates the bjudzhetnoe_polnomochie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public bjudzhetnoe_polnomochie updatebjudzhetnoe_polnomochie(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		return bjudzhetnoe_polnomochiePersistence.update(bjudzhetnoe_polnomochie);
	}

	/**
	 * Returns the bjudzhetnoe_polnomochie local service.
	 *
	 * @return the bjudzhetnoe_polnomochie local service
	 */
	public bjudzhetnoe_polnomochieLocalService getbjudzhetnoe_polnomochieLocalService() {
		return bjudzhetnoe_polnomochieLocalService;
	}

	/**
	 * Sets the bjudzhetnoe_polnomochie local service.
	 *
	 * @param bjudzhetnoe_polnomochieLocalService the bjudzhetnoe_polnomochie local service
	 */
	public void setbjudzhetnoe_polnomochieLocalService(
		bjudzhetnoe_polnomochieLocalService bjudzhetnoe_polnomochieLocalService) {
		this.bjudzhetnoe_polnomochieLocalService = bjudzhetnoe_polnomochieLocalService;
	}

	/**
	 * Returns the bjudzhetnoe_polnomochie persistence.
	 *
	 * @return the bjudzhetnoe_polnomochie persistence
	 */
	public bjudzhetnoe_polnomochiePersistence getbjudzhetnoe_polnomochiePersistence() {
		return bjudzhetnoe_polnomochiePersistence;
	}

	/**
	 * Sets the bjudzhetnoe_polnomochie persistence.
	 *
	 * @param bjudzhetnoe_polnomochiePersistence the bjudzhetnoe_polnomochie persistence
	 */
	public void setbjudzhetnoe_polnomochiePersistence(
		bjudzhetnoe_polnomochiePersistence bjudzhetnoe_polnomochiePersistence) {
		this.bjudzhetnoe_polnomochiePersistence = bjudzhetnoe_polnomochiePersistence;
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
		persistedModelLocalServiceRegistry.register("tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie",
			bjudzhetnoe_polnomochieLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return bjudzhetnoe_polnomochieLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return bjudzhetnoe_polnomochie.class;
	}

	protected String getModelClassName() {
		return bjudzhetnoe_polnomochie.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = bjudzhetnoe_polnomochiePersistence.getDataSource();

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

	@BeanReference(type = bjudzhetnoe_polnomochieLocalService.class)
	protected bjudzhetnoe_polnomochieLocalService bjudzhetnoe_polnomochieLocalService;
	@BeanReference(type = bjudzhetnoe_polnomochiePersistence.class)
	protected bjudzhetnoe_polnomochiePersistence bjudzhetnoe_polnomochiePersistence;
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