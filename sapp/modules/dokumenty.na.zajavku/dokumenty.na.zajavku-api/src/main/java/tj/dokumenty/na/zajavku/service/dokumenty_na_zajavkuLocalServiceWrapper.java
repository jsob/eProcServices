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

package tj.dokumenty.na.zajavku.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link dokumenty_na_zajavkuLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_na_zajavkuLocalService
 * @generated
 */
@ProviderType
public class dokumenty_na_zajavkuLocalServiceWrapper
	implements dokumenty_na_zajavkuLocalService,
		ServiceWrapper<dokumenty_na_zajavkuLocalService> {
	public dokumenty_na_zajavkuLocalServiceWrapper(
		dokumenty_na_zajavkuLocalService dokumenty_na_zajavkuLocalService) {
		_dokumenty_na_zajavkuLocalService = dokumenty_na_zajavkuLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _dokumenty_na_zajavkuLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dokumenty_na_zajavkuLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _dokumenty_na_zajavkuLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dokumenty_na_zajavkuLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dokumenty_na_zajavkuLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of dokumenty_na_zajavkus.
	*
	* @return the number of dokumenty_na_zajavkus
	*/
	@Override
	public int getdokumenty_na_zajavkusCount() {
		return _dokumenty_na_zajavkuLocalService.getdokumenty_na_zajavkusCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _dokumenty_na_zajavkuLocalService.getOSGiServiceIdentifier();
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
		return _dokumenty_na_zajavkuLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dokumenty_na_zajavkuLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dokumenty_na_zajavkuLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the dokumenty_na_zajavkus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty_na_zajavkus
	* @param end the upper bound of the range of dokumenty_na_zajavkus (not inclusive)
	* @return the range of dokumenty_na_zajavkus
	*/
	@Override
	public java.util.List<tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku> getdokumenty_na_zajavkus(
		int start, int end) {
		return _dokumenty_na_zajavkuLocalService.getdokumenty_na_zajavkus(start,
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
		return _dokumenty_na_zajavkuLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dokumenty_na_zajavkuLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the dokumenty_na_zajavku to the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_na_zajavku the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku that was added
	*/
	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku adddokumenty_na_zajavku(
		tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku dokumenty_na_zajavku) {
		return _dokumenty_na_zajavkuLocalService.adddokumenty_na_zajavku(dokumenty_na_zajavku);
	}

	/**
	* Creates a new dokumenty_na_zajavku with the primary key. Does not add the dokumenty_na_zajavku to the database.
	*
	* @param dokumenty_na_zajavku_id the primary key for the new dokumenty_na_zajavku
	* @return the new dokumenty_na_zajavku
	*/
	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku createdokumenty_na_zajavku(
		long dokumenty_na_zajavku_id) {
		return _dokumenty_na_zajavkuLocalService.createdokumenty_na_zajavku(dokumenty_na_zajavku_id);
	}

	/**
	* Deletes the dokumenty_na_zajavku with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_na_zajavku_id the primary key of the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku that was removed
	* @throws PortalException if a dokumenty_na_zajavku with the primary key could not be found
	*/
	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku deletedokumenty_na_zajavku(
		long dokumenty_na_zajavku_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dokumenty_na_zajavkuLocalService.deletedokumenty_na_zajavku(dokumenty_na_zajavku_id);
	}

	/**
	* Deletes the dokumenty_na_zajavku from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_na_zajavku the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku that was removed
	*/
	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku deletedokumenty_na_zajavku(
		tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku dokumenty_na_zajavku) {
		return _dokumenty_na_zajavkuLocalService.deletedokumenty_na_zajavku(dokumenty_na_zajavku);
	}

	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku fetchdokumenty_na_zajavku(
		long dokumenty_na_zajavku_id) {
		return _dokumenty_na_zajavkuLocalService.fetchdokumenty_na_zajavku(dokumenty_na_zajavku_id);
	}

	/**
	* Returns the dokumenty_na_zajavku with the primary key.
	*
	* @param dokumenty_na_zajavku_id the primary key of the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku
	* @throws PortalException if a dokumenty_na_zajavku with the primary key could not be found
	*/
	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku getdokumenty_na_zajavku(
		long dokumenty_na_zajavku_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dokumenty_na_zajavkuLocalService.getdokumenty_na_zajavku(dokumenty_na_zajavku_id);
	}

	/**
	* Updates the dokumenty_na_zajavku in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_na_zajavku the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku that was updated
	*/
	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku updatedokumenty_na_zajavku(
		tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku dokumenty_na_zajavku) {
		return _dokumenty_na_zajavkuLocalService.updatedokumenty_na_zajavku(dokumenty_na_zajavku);
	}

	@Override
	public dokumenty_na_zajavkuLocalService getWrappedService() {
		return _dokumenty_na_zajavkuLocalService;
	}

	@Override
	public void setWrappedService(
		dokumenty_na_zajavkuLocalService dokumenty_na_zajavkuLocalService) {
		_dokumenty_na_zajavkuLocalService = dokumenty_na_zajavkuLocalService;
	}

	private dokumenty_na_zajavkuLocalService _dokumenty_na_zajavkuLocalService;
}