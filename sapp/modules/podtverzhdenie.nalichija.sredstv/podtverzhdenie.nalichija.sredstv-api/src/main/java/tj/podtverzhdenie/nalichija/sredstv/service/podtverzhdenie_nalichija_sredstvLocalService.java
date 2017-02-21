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

package tj.podtverzhdenie.nalichija.sredstv.service;

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

import tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for podtverzhdenie_nalichija_sredstv. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_nalichija_sredstvLocalServiceUtil
 * @see tj.podtverzhdenie.nalichija.sredstv.service.base.podtverzhdenie_nalichija_sredstvLocalServiceBaseImpl
 * @see tj.podtverzhdenie.nalichija.sredstv.service.impl.podtverzhdenie_nalichija_sredstvLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface podtverzhdenie_nalichija_sredstvLocalService
	extends BaseLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link podtverzhdenie_nalichija_sredstvLocalServiceUtil} to access the podtverzhdenie_nalichija_sredstv local service. Add custom service methods to {@link tj.podtverzhdenie.nalichija.sredstv.service.impl.podtverzhdenie_nalichija_sredstvLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	* Returns the number of podtverzhdenie_nalichija_sredstvs.
	*
	* @return the number of podtverzhdenie_nalichija_sredstvs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getpodtverzhdenie_nalichija_sredstvsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the podtverzhdenie_nalichija_sredstvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	* @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	* @return the range of podtverzhdenie_nalichija_sredstvs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<podtverzhdenie_nalichija_sredstv> getpodtverzhdenie_nalichija_sredstvs(
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
	* Adds the podtverzhdenie_nalichija_sredstv to the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_nalichija_sredstv the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public podtverzhdenie_nalichija_sredstv addpodtverzhdenie_nalichija_sredstv(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv);

	/**
	* Creates a new podtverzhdenie_nalichija_sredstv with the primary key. Does not add the podtverzhdenie_nalichija_sredstv to the database.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key for the new podtverzhdenie_nalichija_sredstv
	* @return the new podtverzhdenie_nalichija_sredstv
	*/
	public podtverzhdenie_nalichija_sredstv createpodtverzhdenie_nalichija_sredstv(
		long podtverzhdenie_nalichija_sredstv_id);

	/**
	* Deletes the podtverzhdenie_nalichija_sredstv with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv that was removed
	* @throws PortalException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public podtverzhdenie_nalichija_sredstv deletepodtverzhdenie_nalichija_sredstv(
		long podtverzhdenie_nalichija_sredstv_id) throws PortalException;

	/**
	* Deletes the podtverzhdenie_nalichija_sredstv from the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_nalichija_sredstv the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public podtverzhdenie_nalichija_sredstv deletepodtverzhdenie_nalichija_sredstv(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public podtverzhdenie_nalichija_sredstv fetchpodtverzhdenie_nalichija_sredstv(
		long podtverzhdenie_nalichija_sredstv_id);

	/**
	* Returns the podtverzhdenie_nalichija_sredstv with the primary key.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv
	* @throws PortalException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public podtverzhdenie_nalichija_sredstv getpodtverzhdenie_nalichija_sredstv(
		long podtverzhdenie_nalichija_sredstv_id) throws PortalException;

	/**
	* Updates the podtverzhdenie_nalichija_sredstv in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_nalichija_sredstv the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public podtverzhdenie_nalichija_sredstv updatepodtverzhdenie_nalichija_sredstv(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv);
}