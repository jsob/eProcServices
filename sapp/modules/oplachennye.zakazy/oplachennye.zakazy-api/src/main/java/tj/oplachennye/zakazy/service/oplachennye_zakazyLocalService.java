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

package tj.oplachennye.zakazy.service;

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

import tj.oplachennye.zakazy.model.oplachennye_zakazy;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for oplachennye_zakazy. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see oplachennye_zakazyLocalServiceUtil
 * @see tj.oplachennye.zakazy.service.base.oplachennye_zakazyLocalServiceBaseImpl
 * @see tj.oplachennye.zakazy.service.impl.oplachennye_zakazyLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface oplachennye_zakazyLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link oplachennye_zakazyLocalServiceUtil} to access the oplachennye_zakazy local service. Add custom service methods to {@link tj.oplachennye.zakazy.service.impl.oplachennye_zakazyLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	* Returns the number of oplachennye_zakazies.
	*
	* @return the number of oplachennye_zakazies
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getoplachennye_zakaziesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oplachennye.zakazy.model.impl.oplachennye_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oplachennye.zakazy.model.impl.oplachennye_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the oplachennye_zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oplachennye.zakazy.model.impl.oplachennye_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oplachennye_zakazies
	* @param end the upper bound of the range of oplachennye_zakazies (not inclusive)
	* @return the range of oplachennye_zakazies
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<oplachennye_zakazy> getoplachennye_zakazies(int start, int end);

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
	* Adds the oplachennye_zakazy to the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennye_zakazy the oplachennye_zakazy
	* @return the oplachennye_zakazy that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public oplachennye_zakazy addoplachennye_zakazy(
		oplachennye_zakazy oplachennye_zakazy);

	/**
	* Creates a new oplachennye_zakazy with the primary key. Does not add the oplachennye_zakazy to the database.
	*
	* @param oplachennye_zakazy_id the primary key for the new oplachennye_zakazy
	* @return the new oplachennye_zakazy
	*/
	public oplachennye_zakazy createoplachennye_zakazy(
		long oplachennye_zakazy_id);

	/**
	* Deletes the oplachennye_zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye_zakazy
	* @return the oplachennye_zakazy that was removed
	* @throws PortalException if a oplachennye_zakazy with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public oplachennye_zakazy deleteoplachennye_zakazy(
		long oplachennye_zakazy_id) throws PortalException;

	/**
	* Deletes the oplachennye_zakazy from the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennye_zakazy the oplachennye_zakazy
	* @return the oplachennye_zakazy that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public oplachennye_zakazy deleteoplachennye_zakazy(
		oplachennye_zakazy oplachennye_zakazy);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public oplachennye_zakazy fetchoplachennye_zakazy(
		long oplachennye_zakazy_id);

	/**
	* Returns the oplachennye_zakazy with the primary key.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye_zakazy
	* @return the oplachennye_zakazy
	* @throws PortalException if a oplachennye_zakazy with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public oplachennye_zakazy getoplachennye_zakazy(long oplachennye_zakazy_id)
		throws PortalException;

	/**
	* Updates the oplachennye_zakazy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oplachennye_zakazy the oplachennye_zakazy
	* @return the oplachennye_zakazy that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public oplachennye_zakazy updateoplachennye_zakazy(
		oplachennye_zakazy oplachennye_zakazy);
}