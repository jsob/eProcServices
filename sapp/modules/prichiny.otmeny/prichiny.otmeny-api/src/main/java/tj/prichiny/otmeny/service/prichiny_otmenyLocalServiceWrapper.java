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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link prichiny_otmenyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see prichiny_otmenyLocalService
 * @generated
 */
@ProviderType
public class prichiny_otmenyLocalServiceWrapper
	implements prichiny_otmenyLocalService,
		ServiceWrapper<prichiny_otmenyLocalService> {
	public prichiny_otmenyLocalServiceWrapper(
		prichiny_otmenyLocalService prichiny_otmenyLocalService) {
		_prichiny_otmenyLocalService = prichiny_otmenyLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _prichiny_otmenyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _prichiny_otmenyLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _prichiny_otmenyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prichiny_otmenyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prichiny_otmenyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of prichiny_otmenies.
	*
	* @return the number of prichiny_otmenies
	*/
	@Override
	public int getprichiny_otmeniesCount() {
		return _prichiny_otmenyLocalService.getprichiny_otmeniesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _prichiny_otmenyLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _prichiny_otmenyLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _prichiny_otmenyLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _prichiny_otmenyLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

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
	@Override
	public java.util.List<tj.prichiny.otmeny.model.prichiny_otmeny> getprichiny_otmenies(
		int start, int end) {
		return _prichiny_otmenyLocalService.getprichiny_otmenies(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _prichiny_otmenyLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _prichiny_otmenyLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the prichiny_otmeny to the database. Also notifies the appropriate model listeners.
	*
	* @param prichiny_otmeny the prichiny_otmeny
	* @return the prichiny_otmeny that was added
	*/
	@Override
	public tj.prichiny.otmeny.model.prichiny_otmeny addprichiny_otmeny(
		tj.prichiny.otmeny.model.prichiny_otmeny prichiny_otmeny) {
		return _prichiny_otmenyLocalService.addprichiny_otmeny(prichiny_otmeny);
	}

	/**
	* Creates a new prichiny_otmeny with the primary key. Does not add the prichiny_otmeny to the database.
	*
	* @param prichiny_otmeny_id the primary key for the new prichiny_otmeny
	* @return the new prichiny_otmeny
	*/
	@Override
	public tj.prichiny.otmeny.model.prichiny_otmeny createprichiny_otmeny(
		long prichiny_otmeny_id) {
		return _prichiny_otmenyLocalService.createprichiny_otmeny(prichiny_otmeny_id);
	}

	/**
	* Deletes the prichiny_otmeny with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	* @return the prichiny_otmeny that was removed
	* @throws PortalException if a prichiny_otmeny with the primary key could not be found
	*/
	@Override
	public tj.prichiny.otmeny.model.prichiny_otmeny deleteprichiny_otmeny(
		long prichiny_otmeny_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prichiny_otmenyLocalService.deleteprichiny_otmeny(prichiny_otmeny_id);
	}

	/**
	* Deletes the prichiny_otmeny from the database. Also notifies the appropriate model listeners.
	*
	* @param prichiny_otmeny the prichiny_otmeny
	* @return the prichiny_otmeny that was removed
	*/
	@Override
	public tj.prichiny.otmeny.model.prichiny_otmeny deleteprichiny_otmeny(
		tj.prichiny.otmeny.model.prichiny_otmeny prichiny_otmeny) {
		return _prichiny_otmenyLocalService.deleteprichiny_otmeny(prichiny_otmeny);
	}

	@Override
	public tj.prichiny.otmeny.model.prichiny_otmeny fetchprichiny_otmeny(
		long prichiny_otmeny_id) {
		return _prichiny_otmenyLocalService.fetchprichiny_otmeny(prichiny_otmeny_id);
	}

	/**
	* Returns the prichiny_otmeny with the primary key.
	*
	* @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	* @return the prichiny_otmeny
	* @throws PortalException if a prichiny_otmeny with the primary key could not be found
	*/
	@Override
	public tj.prichiny.otmeny.model.prichiny_otmeny getprichiny_otmeny(
		long prichiny_otmeny_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prichiny_otmenyLocalService.getprichiny_otmeny(prichiny_otmeny_id);
	}

	/**
	* Updates the prichiny_otmeny in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param prichiny_otmeny the prichiny_otmeny
	* @return the prichiny_otmeny that was updated
	*/
	@Override
	public tj.prichiny.otmeny.model.prichiny_otmeny updateprichiny_otmeny(
		tj.prichiny.otmeny.model.prichiny_otmeny prichiny_otmeny) {
		return _prichiny_otmenyLocalService.updateprichiny_otmeny(prichiny_otmeny);
	}

	@Override
	public prichiny_otmenyLocalService getWrappedService() {
		return _prichiny_otmenyLocalService;
	}

	@Override
	public void setWrappedService(
		prichiny_otmenyLocalService prichiny_otmenyLocalService) {
		_prichiny_otmenyLocalService = prichiny_otmenyLocalService;
	}

	private prichiny_otmenyLocalService _prichiny_otmenyLocalService;
}