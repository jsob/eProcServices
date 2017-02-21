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

package tj.konkursnaja.dokumentacija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link konkursnaja_dokumentacijaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see konkursnaja_dokumentacijaLocalService
 * @generated
 */
@ProviderType
public class konkursnaja_dokumentacijaLocalServiceWrapper
	implements konkursnaja_dokumentacijaLocalService,
		ServiceWrapper<konkursnaja_dokumentacijaLocalService> {
	public konkursnaja_dokumentacijaLocalServiceWrapper(
		konkursnaja_dokumentacijaLocalService konkursnaja_dokumentacijaLocalService) {
		_konkursnaja_dokumentacijaLocalService = konkursnaja_dokumentacijaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _konkursnaja_dokumentacijaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _konkursnaja_dokumentacijaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _konkursnaja_dokumentacijaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _konkursnaja_dokumentacijaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _konkursnaja_dokumentacijaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of konkursnaja_dokumentacijas.
	*
	* @return the number of konkursnaja_dokumentacijas
	*/
	@Override
	public int getkonkursnaja_dokumentacijasCount() {
		return _konkursnaja_dokumentacijaLocalService.getkonkursnaja_dokumentacijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _konkursnaja_dokumentacijaLocalService.getOSGiServiceIdentifier();
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
		return _konkursnaja_dokumentacijaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _konkursnaja_dokumentacijaLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _konkursnaja_dokumentacijaLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the konkursnaja_dokumentacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of konkursnaja_dokumentacijas
	* @param end the upper bound of the range of konkursnaja_dokumentacijas (not inclusive)
	* @return the range of konkursnaja_dokumentacijas
	*/
	@Override
	public java.util.List<tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija> getkonkursnaja_dokumentacijas(
		int start, int end) {
		return _konkursnaja_dokumentacijaLocalService.getkonkursnaja_dokumentacijas(start,
			end);
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
		return _konkursnaja_dokumentacijaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _konkursnaja_dokumentacijaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the konkursnaja_dokumentacija to the database. Also notifies the appropriate model listeners.
	*
	* @param konkursnaja_dokumentacija the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija that was added
	*/
	@Override
	public tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija addkonkursnaja_dokumentacija(
		tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		return _konkursnaja_dokumentacijaLocalService.addkonkursnaja_dokumentacija(konkursnaja_dokumentacija);
	}

	/**
	* Creates a new konkursnaja_dokumentacija with the primary key. Does not add the konkursnaja_dokumentacija to the database.
	*
	* @param konkursnaja_dokumentacija_id the primary key for the new konkursnaja_dokumentacija
	* @return the new konkursnaja_dokumentacija
	*/
	@Override
	public tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija createkonkursnaja_dokumentacija(
		long konkursnaja_dokumentacija_id) {
		return _konkursnaja_dokumentacijaLocalService.createkonkursnaja_dokumentacija(konkursnaja_dokumentacija_id);
	}

	/**
	* Deletes the konkursnaja_dokumentacija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param konkursnaja_dokumentacija_id the primary key of the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija that was removed
	* @throws PortalException if a konkursnaja_dokumentacija with the primary key could not be found
	*/
	@Override
	public tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija deletekonkursnaja_dokumentacija(
		long konkursnaja_dokumentacija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _konkursnaja_dokumentacijaLocalService.deletekonkursnaja_dokumentacija(konkursnaja_dokumentacija_id);
	}

	/**
	* Deletes the konkursnaja_dokumentacija from the database. Also notifies the appropriate model listeners.
	*
	* @param konkursnaja_dokumentacija the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija that was removed
	*/
	@Override
	public tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija deletekonkursnaja_dokumentacija(
		tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		return _konkursnaja_dokumentacijaLocalService.deletekonkursnaja_dokumentacija(konkursnaja_dokumentacija);
	}

	@Override
	public tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija fetchkonkursnaja_dokumentacija(
		long konkursnaja_dokumentacija_id) {
		return _konkursnaja_dokumentacijaLocalService.fetchkonkursnaja_dokumentacija(konkursnaja_dokumentacija_id);
	}

	/**
	* Returns the konkursnaja_dokumentacija with the primary key.
	*
	* @param konkursnaja_dokumentacija_id the primary key of the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija
	* @throws PortalException if a konkursnaja_dokumentacija with the primary key could not be found
	*/
	@Override
	public tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija getkonkursnaja_dokumentacija(
		long konkursnaja_dokumentacija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _konkursnaja_dokumentacijaLocalService.getkonkursnaja_dokumentacija(konkursnaja_dokumentacija_id);
	}

	/**
	* Updates the konkursnaja_dokumentacija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param konkursnaja_dokumentacija the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija that was updated
	*/
	@Override
	public tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija updatekonkursnaja_dokumentacija(
		tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		return _konkursnaja_dokumentacijaLocalService.updatekonkursnaja_dokumentacija(konkursnaja_dokumentacija);
	}

	@Override
	public konkursnaja_dokumentacijaLocalService getWrappedService() {
		return _konkursnaja_dokumentacijaLocalService;
	}

	@Override
	public void setWrappedService(
		konkursnaja_dokumentacijaLocalService konkursnaja_dokumentacijaLocalService) {
		_konkursnaja_dokumentacijaLocalService = konkursnaja_dokumentacijaLocalService;
	}

	private konkursnaja_dokumentacijaLocalService _konkursnaja_dokumentacijaLocalService;
}