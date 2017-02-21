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

package tj.pretenzii.ot.postavshhikov.service;

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

import tj.pretenzii.ot.postavshhikov.model.pretenzii_ot_postavshhikov;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for pretenzii_ot_postavshhikov. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see pretenzii_ot_postavshhikovLocalServiceUtil
 * @see tj.pretenzii.ot.postavshhikov.service.base.pretenzii_ot_postavshhikovLocalServiceBaseImpl
 * @see tj.pretenzii.ot.postavshhikov.service.impl.pretenzii_ot_postavshhikovLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface pretenzii_ot_postavshhikovLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link pretenzii_ot_postavshhikovLocalServiceUtil} to access the pretenzii_ot_postavshhikov local service. Add custom service methods to {@link tj.pretenzii.ot.postavshhikov.service.impl.pretenzii_ot_postavshhikovLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	* Returns the number of pretenzii_ot_postavshhikovs.
	*
	* @return the number of pretenzii_ot_postavshhikovs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getpretenzii_ot_postavshhikovsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.pretenzii.ot.postavshhikov.model.impl.pretenzii_ot_postavshhikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.pretenzii.ot.postavshhikov.model.impl.pretenzii_ot_postavshhikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the pretenzii_ot_postavshhikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.pretenzii.ot.postavshhikov.model.impl.pretenzii_ot_postavshhikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pretenzii_ot_postavshhikovs
	* @param end the upper bound of the range of pretenzii_ot_postavshhikovs (not inclusive)
	* @return the range of pretenzii_ot_postavshhikovs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<pretenzii_ot_postavshhikov> getpretenzii_ot_postavshhikovs(
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
	* Adds the pretenzii_ot_postavshhikov to the database. Also notifies the appropriate model listeners.
	*
	* @param pretenzii_ot_postavshhikov the pretenzii_ot_postavshhikov
	* @return the pretenzii_ot_postavshhikov that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public pretenzii_ot_postavshhikov addpretenzii_ot_postavshhikov(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov);

	/**
	* Creates a new pretenzii_ot_postavshhikov with the primary key. Does not add the pretenzii_ot_postavshhikov to the database.
	*
	* @param pretenzii_ot_postavshhikov_id the primary key for the new pretenzii_ot_postavshhikov
	* @return the new pretenzii_ot_postavshhikov
	*/
	public pretenzii_ot_postavshhikov createpretenzii_ot_postavshhikov(
		long pretenzii_ot_postavshhikov_id);

	/**
	* Deletes the pretenzii_ot_postavshhikov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pretenzii_ot_postavshhikov_id the primary key of the pretenzii_ot_postavshhikov
	* @return the pretenzii_ot_postavshhikov that was removed
	* @throws PortalException if a pretenzii_ot_postavshhikov with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public pretenzii_ot_postavshhikov deletepretenzii_ot_postavshhikov(
		long pretenzii_ot_postavshhikov_id) throws PortalException;

	/**
	* Deletes the pretenzii_ot_postavshhikov from the database. Also notifies the appropriate model listeners.
	*
	* @param pretenzii_ot_postavshhikov the pretenzii_ot_postavshhikov
	* @return the pretenzii_ot_postavshhikov that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public pretenzii_ot_postavshhikov deletepretenzii_ot_postavshhikov(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public pretenzii_ot_postavshhikov fetchpretenzii_ot_postavshhikov(
		long pretenzii_ot_postavshhikov_id);

	/**
	* Returns the pretenzii_ot_postavshhikov with the primary key.
	*
	* @param pretenzii_ot_postavshhikov_id the primary key of the pretenzii_ot_postavshhikov
	* @return the pretenzii_ot_postavshhikov
	* @throws PortalException if a pretenzii_ot_postavshhikov with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public pretenzii_ot_postavshhikov getpretenzii_ot_postavshhikov(
		long pretenzii_ot_postavshhikov_id) throws PortalException;

	/**
	* Updates the pretenzii_ot_postavshhikov in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pretenzii_ot_postavshhikov the pretenzii_ot_postavshhikov
	* @return the pretenzii_ot_postavshhikov that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public pretenzii_ot_postavshhikov updatepretenzii_ot_postavshhikov(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov);
}