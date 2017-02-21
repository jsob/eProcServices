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

import tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno;
import tj.spisok.tovarov.vremenno.service.persistence.spisok_tovarov_vremennoPersistence;
import tj.spisok.tovarov.vremenno.service.spisok_tovarov_vremennoLocalService;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the spisok_tovarov_vremenno local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.spisok.tovarov.vremenno.service.impl.spisok_tovarov_vremennoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.spisok.tovarov.vremenno.service.impl.spisok_tovarov_vremennoLocalServiceImpl
 * @see tj.spisok.tovarov.vremenno.service.spisok_tovarov_vremennoLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class spisok_tovarov_vremennoLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements spisok_tovarov_vremennoLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.spisok.tovarov.vremenno.service.spisok_tovarov_vremennoLocalServiceUtil} to access the spisok_tovarov_vremenno local service.
	 */

	/**
	 * Adds the spisok_tovarov_vremenno to the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public spisok_tovarov_vremenno addspisok_tovarov_vremenno(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		spisok_tovarov_vremenno.setNew(true);

		return spisok_tovarov_vremennoPersistence.update(spisok_tovarov_vremenno);
	}

	/**
	 * Creates a new spisok_tovarov_vremenno with the primary key. Does not add the spisok_tovarov_vremenno to the database.
	 *
	 * @param spisok_tovarov_vremenno_id the primary key for the new spisok_tovarov_vremenno
	 * @return the new spisok_tovarov_vremenno
	 */
	@Override
	public spisok_tovarov_vremenno createspisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id) {
		return spisok_tovarov_vremennoPersistence.create(spisok_tovarov_vremenno_id);
	}

	/**
	 * Deletes the spisok_tovarov_vremenno with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno that was removed
	 * @throws PortalException if a spisok_tovarov_vremenno with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public spisok_tovarov_vremenno deletespisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id) throws PortalException {
		return spisok_tovarov_vremennoPersistence.remove(spisok_tovarov_vremenno_id);
	}

	/**
	 * Deletes the spisok_tovarov_vremenno from the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public spisok_tovarov_vremenno deletespisok_tovarov_vremenno(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		return spisok_tovarov_vremennoPersistence.remove(spisok_tovarov_vremenno);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(spisok_tovarov_vremenno.class,
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
		return spisok_tovarov_vremennoPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return spisok_tovarov_vremennoPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return spisok_tovarov_vremennoPersistence.findWithDynamicQuery(dynamicQuery,
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
		return spisok_tovarov_vremennoPersistence.countWithDynamicQuery(dynamicQuery);
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
		return spisok_tovarov_vremennoPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public spisok_tovarov_vremenno fetchspisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id) {
		return spisok_tovarov_vremennoPersistence.fetchByPrimaryKey(spisok_tovarov_vremenno_id);
	}

	/**
	 * Returns the spisok_tovarov_vremenno with the primary key.
	 *
	 * @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno
	 * @throws PortalException if a spisok_tovarov_vremenno with the primary key could not be found
	 */
	@Override
	public spisok_tovarov_vremenno getspisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id) throws PortalException {
		return spisok_tovarov_vremennoPersistence.findByPrimaryKey(spisok_tovarov_vremenno_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(spisok_tovarov_vremennoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(spisok_tovarov_vremenno.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"spisok_tovarov_vremenno_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(spisok_tovarov_vremennoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(spisok_tovarov_vremenno.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"spisok_tovarov_vremenno_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(spisok_tovarov_vremennoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(spisok_tovarov_vremenno.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"spisok_tovarov_vremenno_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return spisok_tovarov_vremennoLocalService.deletespisok_tovarov_vremenno((spisok_tovarov_vremenno)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return spisok_tovarov_vremennoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the spisok_tovarov_vremennos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok_tovarov_vremennos
	 * @param end the upper bound of the range of spisok_tovarov_vremennos (not inclusive)
	 * @return the range of spisok_tovarov_vremennos
	 */
	@Override
	public List<spisok_tovarov_vremenno> getspisok_tovarov_vremennos(
		int start, int end) {
		return spisok_tovarov_vremennoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of spisok_tovarov_vremennos.
	 *
	 * @return the number of spisok_tovarov_vremennos
	 */
	@Override
	public int getspisok_tovarov_vremennosCount() {
		return spisok_tovarov_vremennoPersistence.countAll();
	}

	/**
	 * Updates the spisok_tovarov_vremenno in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public spisok_tovarov_vremenno updatespisok_tovarov_vremenno(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		return spisok_tovarov_vremennoPersistence.update(spisok_tovarov_vremenno);
	}

	/**
	 * Returns the spisok_tovarov_vremenno local service.
	 *
	 * @return the spisok_tovarov_vremenno local service
	 */
	public spisok_tovarov_vremennoLocalService getspisok_tovarov_vremennoLocalService() {
		return spisok_tovarov_vremennoLocalService;
	}

	/**
	 * Sets the spisok_tovarov_vremenno local service.
	 *
	 * @param spisok_tovarov_vremennoLocalService the spisok_tovarov_vremenno local service
	 */
	public void setspisok_tovarov_vremennoLocalService(
		spisok_tovarov_vremennoLocalService spisok_tovarov_vremennoLocalService) {
		this.spisok_tovarov_vremennoLocalService = spisok_tovarov_vremennoLocalService;
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
		persistedModelLocalServiceRegistry.register("tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno",
			spisok_tovarov_vremennoLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return spisok_tovarov_vremennoLocalService.class.getName();
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

	@BeanReference(type = spisok_tovarov_vremennoLocalService.class)
	protected spisok_tovarov_vremennoLocalService spisok_tovarov_vremennoLocalService;
	@BeanReference(type = spisok_tovarov_vremennoPersistence.class)
	protected spisok_tovarov_vremennoPersistence spisok_tovarov_vremennoPersistence;
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