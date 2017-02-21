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

package tj.prichiny.otmeny.service;

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

import tj.prichiny.otmeny.model.prichiny_otmeny;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for prichiny_otmeny. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see prichiny_otmenyLocalServiceUtil
 * @see tj.prichiny.otmeny.service.base.prichiny_otmenyLocalServiceBaseImpl
 * @see tj.prichiny.otmeny.service.impl.prichiny_otmenyLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface prichiny_otmenyLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link prichiny_otmenyLocalServiceUtil} to access the prichiny_otmeny local service. Add custom service methods to {@link tj.prichiny.otmeny.service.impl.prichiny_otmenyLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	* Returns the number of prichiny_otmenies.
	*
	* @return the number of prichiny_otmenies
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getprichiny_otmeniesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.prichiny.otmeny.model.impl.prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.prichiny.otmeny.model.impl.prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the prichiny_otmenies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.prichiny.otmeny.model.impl.prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prichiny_otmenies
	* @param end the upper bound of the range of prichiny_otmenies (not inclusive)
	* @return the range of prichiny_otmenies
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<prichiny_otmeny> getprichiny_otmenies(int start, int end);

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
	* Adds the prichiny_otmeny to the database. Also notifies the appropriate model listeners.
	*
	* @param prichiny_otmeny the prichiny_otmeny
	* @return the prichiny_otmeny that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public prichiny_otmeny addprichiny_otmeny(prichiny_otmeny prichiny_otmeny);

	/**
	* Creates a new prichiny_otmeny with the primary key. Does not add the prichiny_otmeny to the database.
	*
	* @param prichiny_otmeny_id the primary key for the new prichiny_otmeny
	* @return the new prichiny_otmeny
	*/
	public prichiny_otmeny createprichiny_otmeny(long prichiny_otmeny_id);

	/**
	* Deletes the prichiny_otmeny with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	* @return the prichiny_otmeny that was removed
	* @throws PortalException if a prichiny_otmeny with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public prichiny_otmeny deleteprichiny_otmeny(long prichiny_otmeny_id)
		throws PortalException;

	/**
	* Deletes the prichiny_otmeny from the database. Also notifies the appropriate model listeners.
	*
	* @param prichiny_otmeny the prichiny_otmeny
	* @return the prichiny_otmeny that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public prichiny_otmeny deleteprichiny_otmeny(
		prichiny_otmeny prichiny_otmeny);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public prichiny_otmeny fetchprichiny_otmeny(long prichiny_otmeny_id);

	/**
	* Returns the prichiny_otmeny with the primary key.
	*
	* @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	* @return the prichiny_otmeny
	* @throws PortalException if a prichiny_otmeny with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public prichiny_otmeny getprichiny_otmeny(long prichiny_otmeny_id)
		throws PortalException;

	/**
	* Updates the prichiny_otmeny in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param prichiny_otmeny the prichiny_otmeny
	* @return the prichiny_otmeny that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public prichiny_otmeny updateprichiny_otmeny(
		prichiny_otmeny prichiny_otmeny);
}