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

package tj.podtverzhdenie.na.uchastie.service.base;

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

import tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie;
import tj.podtverzhdenie.na.uchastie.service.persistence.podtverzhdenie_na_uchastiePersistence;
import tj.podtverzhdenie.na.uchastie.service.podtverzhdenie_na_uchastieLocalService;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the podtverzhdenie_na_uchastie local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.podtverzhdenie.na.uchastie.service.impl.podtverzhdenie_na_uchastieLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.podtverzhdenie.na.uchastie.service.impl.podtverzhdenie_na_uchastieLocalServiceImpl
 * @see tj.podtverzhdenie.na.uchastie.service.podtverzhdenie_na_uchastieLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class podtverzhdenie_na_uchastieLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements podtverzhdenie_na_uchastieLocalService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.podtverzhdenie.na.uchastie.service.podtverzhdenie_na_uchastieLocalServiceUtil} to access the podtverzhdenie_na_uchastie local service.
	 */

	/**
	 * Adds the podtverzhdenie_na_uchastie to the database. Also notifies the appropriate model listeners.
	 *
	 * @param podtverzhdenie_na_uchastie the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public podtverzhdenie_na_uchastie addpodtverzhdenie_na_uchastie(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		podtverzhdenie_na_uchastie.setNew(true);

		return podtverzhdenie_na_uchastiePersistence.update(podtverzhdenie_na_uchastie);
	}

	/**
	 * Creates a new podtverzhdenie_na_uchastie with the primary key. Does not add the podtverzhdenie_na_uchastie to the database.
	 *
	 * @param podtverzhdenie_na_uchastie_id the primary key for the new podtverzhdenie_na_uchastie
	 * @return the new podtverzhdenie_na_uchastie
	 */
	@Override
	public podtverzhdenie_na_uchastie createpodtverzhdenie_na_uchastie(
		long podtverzhdenie_na_uchastie_id) {
		return podtverzhdenie_na_uchastiePersistence.create(podtverzhdenie_na_uchastie_id);
	}

	/**
	 * Deletes the podtverzhdenie_na_uchastie with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param podtverzhdenie_na_uchastie_id the primary key of the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie that was removed
	 * @throws PortalException if a podtverzhdenie_na_uchastie with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public podtverzhdenie_na_uchastie deletepodtverzhdenie_na_uchastie(
		long podtverzhdenie_na_uchastie_id) throws PortalException {
		return podtverzhdenie_na_uchastiePersistence.remove(podtverzhdenie_na_uchastie_id);
	}

	/**
	 * Deletes the podtverzhdenie_na_uchastie from the database. Also notifies the appropriate model listeners.
	 *
	 * @param podtverzhdenie_na_uchastie the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public podtverzhdenie_na_uchastie deletepodtverzhdenie_na_uchastie(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		return podtverzhdenie_na_uchastiePersistence.remove(podtverzhdenie_na_uchastie);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(podtverzhdenie_na_uchastie.class,
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
		return podtverzhdenie_na_uchastiePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return podtverzhdenie_na_uchastiePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return podtverzhdenie_na_uchastiePersistence.findWithDynamicQuery(dynamicQuery,
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
		return podtverzhdenie_na_uchastiePersistence.countWithDynamicQuery(dynamicQuery);
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
		return podtverzhdenie_na_uchastiePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public podtverzhdenie_na_uchastie fetchpodtverzhdenie_na_uchastie(
		long podtverzhdenie_na_uchastie_id) {
		return podtverzhdenie_na_uchastiePersistence.fetchByPrimaryKey(podtverzhdenie_na_uchastie_id);
	}

	/**
	 * Returns the podtverzhdenie_na_uchastie with the primary key.
	 *
	 * @param podtverzhdenie_na_uchastie_id the primary key of the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie
	 * @throws PortalException if a podtverzhdenie_na_uchastie with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_na_uchastie getpodtverzhdenie_na_uchastie(
		long podtverzhdenie_na_uchastie_id) throws PortalException {
		return podtverzhdenie_na_uchastiePersistence.findByPrimaryKey(podtverzhdenie_na_uchastie_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(podtverzhdenie_na_uchastieLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(podtverzhdenie_na_uchastie.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"podtverzhdenie_na_uchastie_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(podtverzhdenie_na_uchastieLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(podtverzhdenie_na_uchastie.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"podtverzhdenie_na_uchastie_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(podtverzhdenie_na_uchastieLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(podtverzhdenie_na_uchastie.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"podtverzhdenie_na_uchastie_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return podtverzhdenie_na_uchastieLocalService.deletepodtverzhdenie_na_uchastie((podtverzhdenie_na_uchastie)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return podtverzhdenie_na_uchastiePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the podtverzhdenie_na_uchasties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of podtverzhdenie_na_uchasties
	 * @param end the upper bound of the range of podtverzhdenie_na_uchasties (not inclusive)
	 * @return the range of podtverzhdenie_na_uchasties
	 */
	@Override
	public List<podtverzhdenie_na_uchastie> getpodtverzhdenie_na_uchasties(
		int start, int end) {
		return podtverzhdenie_na_uchastiePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of podtverzhdenie_na_uchasties.
	 *
	 * @return the number of podtverzhdenie_na_uchasties
	 */
	@Override
	public int getpodtverzhdenie_na_uchastiesCount() {
		return podtverzhdenie_na_uchastiePersistence.countAll();
	}

	/**
	 * Updates the podtverzhdenie_na_uchastie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param podtverzhdenie_na_uchastie the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public podtverzhdenie_na_uchastie updatepodtverzhdenie_na_uchastie(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		return podtverzhdenie_na_uchastiePersistence.update(podtverzhdenie_na_uchastie);
	}

	/**
	 * Returns the podtverzhdenie_na_uchastie local service.
	 *
	 * @return the podtverzhdenie_na_uchastie local service
	 */
	public podtverzhdenie_na_uchastieLocalService getpodtverzhdenie_na_uchastieLocalService() {
		return podtverzhdenie_na_uchastieLocalService;
	}

	/**
	 * Sets the podtverzhdenie_na_uchastie local service.
	 *
	 * @param podtverzhdenie_na_uchastieLocalService the podtverzhdenie_na_uchastie local service
	 */
	public void setpodtverzhdenie_na_uchastieLocalService(
		podtverzhdenie_na_uchastieLocalService podtverzhdenie_na_uchastieLocalService) {
		this.podtverzhdenie_na_uchastieLocalService = podtverzhdenie_na_uchastieLocalService;
	}

	/**
	 * Returns the podtverzhdenie_na_uchastie persistence.
	 *
	 * @return the podtverzhdenie_na_uchastie persistence
	 */
	public podtverzhdenie_na_uchastiePersistence getpodtverzhdenie_na_uchastiePersistence() {
		return podtverzhdenie_na_uchastiePersistence;
	}

	/**
	 * Sets the podtverzhdenie_na_uchastie persistence.
	 *
	 * @param podtverzhdenie_na_uchastiePersistence the podtverzhdenie_na_uchastie persistence
	 */
	public void setpodtverzhdenie_na_uchastiePersistence(
		podtverzhdenie_na_uchastiePersistence podtverzhdenie_na_uchastiePersistence) {
		this.podtverzhdenie_na_uchastiePersistence = podtverzhdenie_na_uchastiePersistence;
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
		persistedModelLocalServiceRegistry.register("tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie",
			podtverzhdenie_na_uchastieLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return podtverzhdenie_na_uchastieLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return podtverzhdenie_na_uchastie.class;
	}

	protected String getModelClassName() {
		return podtverzhdenie_na_uchastie.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = podtverzhdenie_na_uchastiePersistence.getDataSource();

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

	@BeanReference(type = podtverzhdenie_na_uchastieLocalService.class)
	protected podtverzhdenie_na_uchastieLocalService podtverzhdenie_na_uchastieLocalService;
	@BeanReference(type = podtverzhdenie_na_uchastiePersistence.class)
	protected podtverzhdenie_na_uchastiePersistence podtverzhdenie_na_uchastiePersistence;
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