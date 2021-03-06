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

package tj.tipy.organizacij.service.base;

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

import tj.tipy.organizacij.model.tipy_organizacij;
import tj.tipy.organizacij.service.persistence.tipy_organizacijPersistence;
import tj.tipy.organizacij.service.tipy_organizacijLocalService;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the tipy_organizacij local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.tipy.organizacij.service.impl.tipy_organizacijLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.tipy.organizacij.service.impl.tipy_organizacijLocalServiceImpl
 * @see tj.tipy.organizacij.service.tipy_organizacijLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class tipy_organizacijLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements tipy_organizacijLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.tipy.organizacij.service.tipy_organizacijLocalServiceUtil} to access the tipy_organizacij local service.
	 */

	/**
	 * Adds the tipy_organizacij to the database. Also notifies the appropriate model listeners.
	 *
	 * @param tipy_organizacij the tipy_organizacij
	 * @return the tipy_organizacij that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public tipy_organizacij addtipy_organizacij(
		tipy_organizacij tipy_organizacij) {
		tipy_organizacij.setNew(true);

		return tipy_organizacijPersistence.update(tipy_organizacij);
	}

	/**
	 * Creates a new tipy_organizacij with the primary key. Does not add the tipy_organizacij to the database.
	 *
	 * @param tipy_organizacij_id the primary key for the new tipy_organizacij
	 * @return the new tipy_organizacij
	 */
	@Override
	public tipy_organizacij createtipy_organizacij(long tipy_organizacij_id) {
		return tipy_organizacijPersistence.create(tipy_organizacij_id);
	}

	/**
	 * Deletes the tipy_organizacij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tipy_organizacij_id the primary key of the tipy_organizacij
	 * @return the tipy_organizacij that was removed
	 * @throws PortalException if a tipy_organizacij with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public tipy_organizacij deletetipy_organizacij(long tipy_organizacij_id)
		throws PortalException {
		return tipy_organizacijPersistence.remove(tipy_organizacij_id);
	}

	/**
	 * Deletes the tipy_organizacij from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tipy_organizacij the tipy_organizacij
	 * @return the tipy_organizacij that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public tipy_organizacij deletetipy_organizacij(
		tipy_organizacij tipy_organizacij) {
		return tipy_organizacijPersistence.remove(tipy_organizacij);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(tipy_organizacij.class,
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
		return tipy_organizacijPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.organizacij.model.impl.tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return tipy_organizacijPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.organizacij.model.impl.tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return tipy_organizacijPersistence.findWithDynamicQuery(dynamicQuery,
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
		return tipy_organizacijPersistence.countWithDynamicQuery(dynamicQuery);
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
		return tipy_organizacijPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public tipy_organizacij fetchtipy_organizacij(long tipy_organizacij_id) {
		return tipy_organizacijPersistence.fetchByPrimaryKey(tipy_organizacij_id);
	}

	/**
	 * Returns the tipy_organizacij with the primary key.
	 *
	 * @param tipy_organizacij_id the primary key of the tipy_organizacij
	 * @return the tipy_organizacij
	 * @throws PortalException if a tipy_organizacij with the primary key could not be found
	 */
	@Override
	public tipy_organizacij gettipy_organizacij(long tipy_organizacij_id)
		throws PortalException {
		return tipy_organizacijPersistence.findByPrimaryKey(tipy_organizacij_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(tipy_organizacijLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(tipy_organizacij.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("tipy_organizacij_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(tipy_organizacijLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(tipy_organizacij.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"tipy_organizacij_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(tipy_organizacijLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(tipy_organizacij.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("tipy_organizacij_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return tipy_organizacijLocalService.deletetipy_organizacij((tipy_organizacij)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return tipy_organizacijPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the tipy_organizacijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.organizacij.model.impl.tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy_organizacijs
	 * @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	 * @return the range of tipy_organizacijs
	 */
	@Override
	public List<tipy_organizacij> gettipy_organizacijs(int start, int end) {
		return tipy_organizacijPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of tipy_organizacijs.
	 *
	 * @return the number of tipy_organizacijs
	 */
	@Override
	public int gettipy_organizacijsCount() {
		return tipy_organizacijPersistence.countAll();
	}

	/**
	 * Updates the tipy_organizacij in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param tipy_organizacij the tipy_organizacij
	 * @return the tipy_organizacij that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public tipy_organizacij updatetipy_organizacij(
		tipy_organizacij tipy_organizacij) {
		return tipy_organizacijPersistence.update(tipy_organizacij);
	}

	/**
	 * Returns the tipy_organizacij local service.
	 *
	 * @return the tipy_organizacij local service
	 */
	public tipy_organizacijLocalService gettipy_organizacijLocalService() {
		return tipy_organizacijLocalService;
	}

	/**
	 * Sets the tipy_organizacij local service.
	 *
	 * @param tipy_organizacijLocalService the tipy_organizacij local service
	 */
	public void settipy_organizacijLocalService(
		tipy_organizacijLocalService tipy_organizacijLocalService) {
		this.tipy_organizacijLocalService = tipy_organizacijLocalService;
	}

	/**
	 * Returns the tipy_organizacij persistence.
	 *
	 * @return the tipy_organizacij persistence
	 */
	public tipy_organizacijPersistence gettipy_organizacijPersistence() {
		return tipy_organizacijPersistence;
	}

	/**
	 * Sets the tipy_organizacij persistence.
	 *
	 * @param tipy_organizacijPersistence the tipy_organizacij persistence
	 */
	public void settipy_organizacijPersistence(
		tipy_organizacijPersistence tipy_organizacijPersistence) {
		this.tipy_organizacijPersistence = tipy_organizacijPersistence;
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
		persistedModelLocalServiceRegistry.register("tj.tipy.organizacij.model.tipy_organizacij",
			tipy_organizacijLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"tj.tipy.organizacij.model.tipy_organizacij");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return tipy_organizacijLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return tipy_organizacij.class;
	}

	protected String getModelClassName() {
		return tipy_organizacij.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = tipy_organizacijPersistence.getDataSource();

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

	@BeanReference(type = tipy_organizacijLocalService.class)
	protected tipy_organizacijLocalService tipy_organizacijLocalService;
	@BeanReference(type = tipy_organizacijPersistence.class)
	protected tipy_organizacijPersistence tipy_organizacijPersistence;
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