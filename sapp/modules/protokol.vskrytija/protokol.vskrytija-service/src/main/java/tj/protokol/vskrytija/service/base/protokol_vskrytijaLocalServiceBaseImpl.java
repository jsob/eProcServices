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

package tj.protokol.vskrytija.service.base;

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

import tj.protokol.vskrytija.model.protokol_vskrytija;
import tj.protokol.vskrytija.service.persistence.protokol_vskrytijaPersistence;
import tj.protokol.vskrytija.service.protokol_vskrytijaLocalService;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the protokol_vskrytija local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.protokol.vskrytija.service.impl.protokol_vskrytijaLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.protokol.vskrytija.service.impl.protokol_vskrytijaLocalServiceImpl
 * @see tj.protokol.vskrytija.service.protokol_vskrytijaLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class protokol_vskrytijaLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements protokol_vskrytijaLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.protokol.vskrytija.service.protokol_vskrytijaLocalServiceUtil} to access the protokol_vskrytija local service.
	 */

	/**
	 * Adds the protokol_vskrytija to the database. Also notifies the appropriate model listeners.
	 *
	 * @param protokol_vskrytija the protokol_vskrytija
	 * @return the protokol_vskrytija that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public protokol_vskrytija addprotokol_vskrytija(
		protokol_vskrytija protokol_vskrytija) {
		protokol_vskrytija.setNew(true);

		return protokol_vskrytijaPersistence.update(protokol_vskrytija);
	}

	/**
	 * Creates a new protokol_vskrytija with the primary key. Does not add the protokol_vskrytija to the database.
	 *
	 * @param protokol_vskrytija_id the primary key for the new protokol_vskrytija
	 * @return the new protokol_vskrytija
	 */
	@Override
	public protokol_vskrytija createprotokol_vskrytija(
		long protokol_vskrytija_id) {
		return protokol_vskrytijaPersistence.create(protokol_vskrytija_id);
	}

	/**
	 * Deletes the protokol_vskrytija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	 * @return the protokol_vskrytija that was removed
	 * @throws PortalException if a protokol_vskrytija with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public protokol_vskrytija deleteprotokol_vskrytija(
		long protokol_vskrytija_id) throws PortalException {
		return protokol_vskrytijaPersistence.remove(protokol_vskrytija_id);
	}

	/**
	 * Deletes the protokol_vskrytija from the database. Also notifies the appropriate model listeners.
	 *
	 * @param protokol_vskrytija the protokol_vskrytija
	 * @return the protokol_vskrytija that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public protokol_vskrytija deleteprotokol_vskrytija(
		protokol_vskrytija protokol_vskrytija) {
		return protokol_vskrytijaPersistence.remove(protokol_vskrytija);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(protokol_vskrytija.class,
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
		return protokol_vskrytijaPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.vskrytija.model.impl.protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return protokol_vskrytijaPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.vskrytija.model.impl.protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return protokol_vskrytijaPersistence.findWithDynamicQuery(dynamicQuery,
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
		return protokol_vskrytijaPersistence.countWithDynamicQuery(dynamicQuery);
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
		return protokol_vskrytijaPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public protokol_vskrytija fetchprotokol_vskrytija(
		long protokol_vskrytija_id) {
		return protokol_vskrytijaPersistence.fetchByPrimaryKey(protokol_vskrytija_id);
	}

	/**
	 * Returns the protokol_vskrytija with the primary key.
	 *
	 * @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	 * @return the protokol_vskrytija
	 * @throws PortalException if a protokol_vskrytija with the primary key could not be found
	 */
	@Override
	public protokol_vskrytija getprotokol_vskrytija(long protokol_vskrytija_id)
		throws PortalException {
		return protokol_vskrytijaPersistence.findByPrimaryKey(protokol_vskrytija_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(protokol_vskrytijaLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(protokol_vskrytija.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"protokol_vskrytija_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(protokol_vskrytijaLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(protokol_vskrytija.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"protokol_vskrytija_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(protokol_vskrytijaLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(protokol_vskrytija.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"protokol_vskrytija_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return protokol_vskrytijaLocalService.deleteprotokol_vskrytija((protokol_vskrytija)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return protokol_vskrytijaPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the protokol_vskrytijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.vskrytija.model.impl.protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protokol_vskrytijas
	 * @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	 * @return the range of protokol_vskrytijas
	 */
	@Override
	public List<protokol_vskrytija> getprotokol_vskrytijas(int start, int end) {
		return protokol_vskrytijaPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of protokol_vskrytijas.
	 *
	 * @return the number of protokol_vskrytijas
	 */
	@Override
	public int getprotokol_vskrytijasCount() {
		return protokol_vskrytijaPersistence.countAll();
	}

	/**
	 * Updates the protokol_vskrytija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param protokol_vskrytija the protokol_vskrytija
	 * @return the protokol_vskrytija that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public protokol_vskrytija updateprotokol_vskrytija(
		protokol_vskrytija protokol_vskrytija) {
		return protokol_vskrytijaPersistence.update(protokol_vskrytija);
	}

	/**
	 * Returns the protokol_vskrytija local service.
	 *
	 * @return the protokol_vskrytija local service
	 */
	public protokol_vskrytijaLocalService getprotokol_vskrytijaLocalService() {
		return protokol_vskrytijaLocalService;
	}

	/**
	 * Sets the protokol_vskrytija local service.
	 *
	 * @param protokol_vskrytijaLocalService the protokol_vskrytija local service
	 */
	public void setprotokol_vskrytijaLocalService(
		protokol_vskrytijaLocalService protokol_vskrytijaLocalService) {
		this.protokol_vskrytijaLocalService = protokol_vskrytijaLocalService;
	}

	/**
	 * Returns the protokol_vskrytija persistence.
	 *
	 * @return the protokol_vskrytija persistence
	 */
	public protokol_vskrytijaPersistence getprotokol_vskrytijaPersistence() {
		return protokol_vskrytijaPersistence;
	}

	/**
	 * Sets the protokol_vskrytija persistence.
	 *
	 * @param protokol_vskrytijaPersistence the protokol_vskrytija persistence
	 */
	public void setprotokol_vskrytijaPersistence(
		protokol_vskrytijaPersistence protokol_vskrytijaPersistence) {
		this.protokol_vskrytijaPersistence = protokol_vskrytijaPersistence;
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
		persistedModelLocalServiceRegistry.register("tj.protokol.vskrytija.model.protokol_vskrytija",
			protokol_vskrytijaLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"tj.protokol.vskrytija.model.protokol_vskrytija");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return protokol_vskrytijaLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return protokol_vskrytija.class;
	}

	protected String getModelClassName() {
		return protokol_vskrytija.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = protokol_vskrytijaPersistence.getDataSource();

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

	@BeanReference(type = protokol_vskrytijaLocalService.class)
	protected protokol_vskrytijaLocalService protokol_vskrytijaLocalService;
	@BeanReference(type = protokol_vskrytijaPersistence.class)
	protected protokol_vskrytijaPersistence protokol_vskrytijaPersistence;
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