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

package tj.sostojanie.izvewenij.service;

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

import tj.sostojanie.izvewenij.model.sostojanie_izvewenij;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for sostojanie_izvewenij. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see sostojanie_izvewenijLocalServiceUtil
 * @see tj.sostojanie.izvewenij.service.base.sostojanie_izvewenijLocalServiceBaseImpl
 * @see tj.sostojanie.izvewenij.service.impl.sostojanie_izvewenijLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface sostojanie_izvewenijLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link sostojanie_izvewenijLocalServiceUtil} to access the sostojanie_izvewenij local service. Add custom service methods to {@link tj.sostojanie.izvewenij.service.impl.sostojanie_izvewenijLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	* Returns the number of sostojanie_izvewenijs.
	*
	* @return the number of sostojanie_izvewenijs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getsostojanie_izvewenijsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the sostojanie_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sostojanie_izvewenijs
	* @param end the upper bound of the range of sostojanie_izvewenijs (not inclusive)
	* @return the range of sostojanie_izvewenijs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<sostojanie_izvewenij> getsostojanie_izvewenijs(int start,
		int end);

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
	* Adds the sostojanie_izvewenij to the database. Also notifies the appropriate model listeners.
	*
	* @param sostojanie_izvewenij the sostojanie_izvewenij
	* @return the sostojanie_izvewenij that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public sostojanie_izvewenij addsostojanie_izvewenij(
		sostojanie_izvewenij sostojanie_izvewenij);

	/**
	* Creates a new sostojanie_izvewenij with the primary key. Does not add the sostojanie_izvewenij to the database.
	*
	* @param sostojanie_izvewenij_id the primary key for the new sostojanie_izvewenij
	* @return the new sostojanie_izvewenij
	*/
	public sostojanie_izvewenij createsostojanie_izvewenij(
		long sostojanie_izvewenij_id);

	/**
	* Deletes the sostojanie_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sostojanie_izvewenij_id the primary key of the sostojanie_izvewenij
	* @return the sostojanie_izvewenij that was removed
	* @throws PortalException if a sostojanie_izvewenij with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public sostojanie_izvewenij deletesostojanie_izvewenij(
		long sostojanie_izvewenij_id) throws PortalException;

	/**
	* Deletes the sostojanie_izvewenij from the database. Also notifies the appropriate model listeners.
	*
	* @param sostojanie_izvewenij the sostojanie_izvewenij
	* @return the sostojanie_izvewenij that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public sostojanie_izvewenij deletesostojanie_izvewenij(
		sostojanie_izvewenij sostojanie_izvewenij);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public sostojanie_izvewenij fetchsostojanie_izvewenij(
		long sostojanie_izvewenij_id);

	/**
	* Returns the sostojanie_izvewenij with the primary key.
	*
	* @param sostojanie_izvewenij_id the primary key of the sostojanie_izvewenij
	* @return the sostojanie_izvewenij
	* @throws PortalException if a sostojanie_izvewenij with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public sostojanie_izvewenij getsostojanie_izvewenij(
		long sostojanie_izvewenij_id) throws PortalException;

	/**
	* Updates the sostojanie_izvewenij in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sostojanie_izvewenij the sostojanie_izvewenij
	* @return the sostojanie_izvewenij that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public sostojanie_izvewenij updatesostojanie_izvewenij(
		sostojanie_izvewenij sostojanie_izvewenij);
}