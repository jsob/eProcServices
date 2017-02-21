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

package tj.ne.sostojavshiesja.zakazy.service;

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

import tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for ne_sostojavshiesja_zakazy. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ne_sostojavshiesja_zakazyLocalServiceUtil
 * @see tj.ne.sostojavshiesja.zakazy.service.base.ne_sostojavshiesja_zakazyLocalServiceBaseImpl
 * @see tj.ne.sostojavshiesja.zakazy.service.impl.ne_sostojavshiesja_zakazyLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ne_sostojavshiesja_zakazyLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ne_sostojavshiesja_zakazyLocalServiceUtil} to access the ne_sostojavshiesja_zakazy local service. Add custom service methods to {@link tj.ne.sostojavshiesja.zakazy.service.impl.ne_sostojavshiesja_zakazyLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	* Returns the number of ne_sostojavshiesja_zakazies.
	*
	* @return the number of ne_sostojavshiesja_zakazies
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getne_sostojavshiesja_zakaziesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the ne_sostojavshiesja_zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_sostojavshiesja_zakazies
	* @param end the upper bound of the range of ne_sostojavshiesja_zakazies (not inclusive)
	* @return the range of ne_sostojavshiesja_zakazies
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ne_sostojavshiesja_zakazy> getne_sostojavshiesja_zakazies(
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
	* Adds the ne_sostojavshiesja_zakazy to the database. Also notifies the appropriate model listeners.
	*
	* @param ne_sostojavshiesja_zakazy the ne_sostojavshiesja_zakazy
	* @return the ne_sostojavshiesja_zakazy that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ne_sostojavshiesja_zakazy addne_sostojavshiesja_zakazy(
		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy);

	/**
	* Creates a new ne_sostojavshiesja_zakazy with the primary key. Does not add the ne_sostojavshiesja_zakazy to the database.
	*
	* @param ne_sostojavshiesja_zakazy_id the primary key for the new ne_sostojavshiesja_zakazy
	* @return the new ne_sostojavshiesja_zakazy
	*/
	public ne_sostojavshiesja_zakazy createne_sostojavshiesja_zakazy(
		long ne_sostojavshiesja_zakazy_id);

	/**
	* Deletes the ne_sostojavshiesja_zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ne_sostojavshiesja_zakazy_id the primary key of the ne_sostojavshiesja_zakazy
	* @return the ne_sostojavshiesja_zakazy that was removed
	* @throws PortalException if a ne_sostojavshiesja_zakazy with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public ne_sostojavshiesja_zakazy deletene_sostojavshiesja_zakazy(
		long ne_sostojavshiesja_zakazy_id) throws PortalException;

	/**
	* Deletes the ne_sostojavshiesja_zakazy from the database. Also notifies the appropriate model listeners.
	*
	* @param ne_sostojavshiesja_zakazy the ne_sostojavshiesja_zakazy
	* @return the ne_sostojavshiesja_zakazy that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ne_sostojavshiesja_zakazy deletene_sostojavshiesja_zakazy(
		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ne_sostojavshiesja_zakazy fetchne_sostojavshiesja_zakazy(
		long ne_sostojavshiesja_zakazy_id);

	/**
	* Returns the ne_sostojavshiesja_zakazy with the primary key.
	*
	* @param ne_sostojavshiesja_zakazy_id the primary key of the ne_sostojavshiesja_zakazy
	* @return the ne_sostojavshiesja_zakazy
	* @throws PortalException if a ne_sostojavshiesja_zakazy with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ne_sostojavshiesja_zakazy getne_sostojavshiesja_zakazy(
		long ne_sostojavshiesja_zakazy_id) throws PortalException;

	/**
	* Updates the ne_sostojavshiesja_zakazy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ne_sostojavshiesja_zakazy the ne_sostojavshiesja_zakazy
	* @return the ne_sostojavshiesja_zakazy that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ne_sostojavshiesja_zakazy updatene_sostojavshiesja_zakazy(
		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy);
}