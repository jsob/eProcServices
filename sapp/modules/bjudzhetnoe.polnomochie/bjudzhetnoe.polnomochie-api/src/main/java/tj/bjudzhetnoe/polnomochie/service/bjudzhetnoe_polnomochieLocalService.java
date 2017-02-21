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

package tj.bjudzhetnoe.polnomochie.service;

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

import tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for bjudzhetnoe_polnomochie. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see bjudzhetnoe_polnomochieLocalServiceUtil
 * @see tj.bjudzhetnoe.polnomochie.service.base.bjudzhetnoe_polnomochieLocalServiceBaseImpl
 * @see tj.bjudzhetnoe.polnomochie.service.impl.bjudzhetnoe_polnomochieLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface bjudzhetnoe_polnomochieLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link bjudzhetnoe_polnomochieLocalServiceUtil} to access the bjudzhetnoe_polnomochie local service. Add custom service methods to {@link tj.bjudzhetnoe.polnomochie.service.impl.bjudzhetnoe_polnomochieLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	* Returns the number of bjudzhetnoe_polnomochies.
	*
	* @return the number of bjudzhetnoe_polnomochies
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getbjudzhetnoe_polnomochiesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<bjudzhetnoe_polnomochie> getbjudzhetnoe_polnomochies(
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
	* Adds the bjudzhetnoe_polnomochie to the database. Also notifies the appropriate model listeners.
	*
	* @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public bjudzhetnoe_polnomochie addbjudzhetnoe_polnomochie(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie);

	/**
	* Creates a new bjudzhetnoe_polnomochie with the primary key. Does not add the bjudzhetnoe_polnomochie to the database.
	*
	* @param bjudzhetnoe_polnomochie_id the primary key for the new bjudzhetnoe_polnomochie
	* @return the new bjudzhetnoe_polnomochie
	*/
	public bjudzhetnoe_polnomochie createbjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id);

	/**
	* Deletes the bjudzhetnoe_polnomochie with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie that was removed
	* @throws PortalException if a bjudzhetnoe_polnomochie with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public bjudzhetnoe_polnomochie deletebjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id) throws PortalException;

	/**
	* Deletes the bjudzhetnoe_polnomochie from the database. Also notifies the appropriate model listeners.
	*
	* @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public bjudzhetnoe_polnomochie deletebjudzhetnoe_polnomochie(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public bjudzhetnoe_polnomochie fetchbjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id);

	/**
	* Returns the bjudzhetnoe_polnomochie with the primary key.
	*
	* @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie
	* @throws PortalException if a bjudzhetnoe_polnomochie with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public bjudzhetnoe_polnomochie getbjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id) throws PortalException;

	/**
	* Updates the bjudzhetnoe_polnomochie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public bjudzhetnoe_polnomochie updatebjudzhetnoe_polnomochie(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie);
}