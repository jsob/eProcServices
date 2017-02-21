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

package tj.spisok.tovarov.vremenno.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for spisok_tovarov_vremenno. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarov_vremennoLocalServiceUtil
 * @see tj.spisok.tovarov.vremenno.service.base.spisok_tovarov_vremennoLocalServiceBaseImpl
 * @see tj.spisok.tovarov.vremenno.service.impl.spisok_tovarov_vremennoLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface spisok_tovarov_vremennoLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link spisok_tovarov_vremennoLocalServiceUtil} to access the spisok_tovarov_vremenno local service. Add custom service methods to {@link tj.spisok.tovarov.vremenno.service.impl.spisok_tovarov_vremennoLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of spisok_tovarov_vremennos.
	*
	* @return the number of spisok_tovarov_vremennos
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getspisok_tovarov_vremennosCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<spisok_tovarov_vremenno> getspisok_tovarov_vremennos(
		int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	/**
	* Adds the spisok_tovarov_vremenno to the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public spisok_tovarov_vremenno addspisok_tovarov_vremenno(
		spisok_tovarov_vremenno spisok_tovarov_vremenno);

	/**
	* Creates a new spisok_tovarov_vremenno with the primary key. Does not add the spisok_tovarov_vremenno to the database.
	*
	* @param spisok_tovarov_vremenno_id the primary key for the new spisok_tovarov_vremenno
	* @return the new spisok_tovarov_vremenno
	*/
	public spisok_tovarov_vremenno createspisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id);

	/**
	* Deletes the spisok_tovarov_vremenno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno that was removed
	* @throws PortalException if a spisok_tovarov_vremenno with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public spisok_tovarov_vremenno deletespisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id) throws PortalException;

	/**
	* Deletes the spisok_tovarov_vremenno from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public spisok_tovarov_vremenno deletespisok_tovarov_vremenno(
		spisok_tovarov_vremenno spisok_tovarov_vremenno);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public spisok_tovarov_vremenno fetchspisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id);

	/**
	* Returns the spisok_tovarov_vremenno with the primary key.
	*
	* @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno
	* @throws PortalException if a spisok_tovarov_vremenno with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public spisok_tovarov_vremenno getspisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id) throws PortalException;

	/**
	* Updates the spisok_tovarov_vremenno in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public spisok_tovarov_vremenno updatespisok_tovarov_vremenno(
		spisok_tovarov_vremenno spisok_tovarov_vremenno);
}