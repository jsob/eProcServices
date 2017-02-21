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

package tj.otpravlennye.zajavki.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link otpravlennye_zajavkiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see otpravlennye_zajavkiLocalService
 * @generated
 */
@ProviderType
public class otpravlennye_zajavkiLocalServiceWrapper
	implements otpravlennye_zajavkiLocalService,
		ServiceWrapper<otpravlennye_zajavkiLocalService> {
	public otpravlennye_zajavkiLocalServiceWrapper(
		otpravlennye_zajavkiLocalService otpravlennye_zajavkiLocalService) {
		_otpravlennye_zajavkiLocalService = otpravlennye_zajavkiLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _otpravlennye_zajavkiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _otpravlennye_zajavkiLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _otpravlennye_zajavkiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _otpravlennye_zajavkiLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _otpravlennye_zajavkiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of otpravlennye_zajavkis.
	*
	* @return the number of otpravlennye_zajavkis
	*/
	@Override
	public int getotpravlennye_zajavkisCount() {
		return _otpravlennye_zajavkiLocalService.getotpravlennye_zajavkisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _otpravlennye_zajavkiLocalService.getOSGiServiceIdentifier();
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
		return _otpravlennye_zajavkiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _otpravlennye_zajavkiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _otpravlennye_zajavkiLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the otpravlennye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otpravlennye_zajavkis
	* @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	* @return the range of otpravlennye_zajavkis
	*/
	@Override
	public java.util.List<tj.otpravlennye.zajavki.model.otpravlennye_zajavki> getotpravlennye_zajavkis(
		int start, int end) {
		return _otpravlennye_zajavkiLocalService.getotpravlennye_zajavkis(start,
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
		return _otpravlennye_zajavkiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _otpravlennye_zajavkiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the otpravlennye_zajavki to the database. Also notifies the appropriate model listeners.
	*
	* @param otpravlennye_zajavki the otpravlennye_zajavki
	* @return the otpravlennye_zajavki that was added
	*/
	@Override
	public tj.otpravlennye.zajavki.model.otpravlennye_zajavki addotpravlennye_zajavki(
		tj.otpravlennye.zajavki.model.otpravlennye_zajavki otpravlennye_zajavki) {
		return _otpravlennye_zajavkiLocalService.addotpravlennye_zajavki(otpravlennye_zajavki);
	}

	/**
	* Creates a new otpravlennye_zajavki with the primary key. Does not add the otpravlennye_zajavki to the database.
	*
	* @param otpravlennye_zajavki_id the primary key for the new otpravlennye_zajavki
	* @return the new otpravlennye_zajavki
	*/
	@Override
	public tj.otpravlennye.zajavki.model.otpravlennye_zajavki createotpravlennye_zajavki(
		long otpravlennye_zajavki_id) {
		return _otpravlennye_zajavkiLocalService.createotpravlennye_zajavki(otpravlennye_zajavki_id);
	}

	/**
	* Deletes the otpravlennye_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	* @return the otpravlennye_zajavki that was removed
	* @throws PortalException if a otpravlennye_zajavki with the primary key could not be found
	*/
	@Override
	public tj.otpravlennye.zajavki.model.otpravlennye_zajavki deleteotpravlennye_zajavki(
		long otpravlennye_zajavki_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _otpravlennye_zajavkiLocalService.deleteotpravlennye_zajavki(otpravlennye_zajavki_id);
	}

	/**
	* Deletes the otpravlennye_zajavki from the database. Also notifies the appropriate model listeners.
	*
	* @param otpravlennye_zajavki the otpravlennye_zajavki
	* @return the otpravlennye_zajavki that was removed
	*/
	@Override
	public tj.otpravlennye.zajavki.model.otpravlennye_zajavki deleteotpravlennye_zajavki(
		tj.otpravlennye.zajavki.model.otpravlennye_zajavki otpravlennye_zajavki) {
		return _otpravlennye_zajavkiLocalService.deleteotpravlennye_zajavki(otpravlennye_zajavki);
	}

	@Override
	public tj.otpravlennye.zajavki.model.otpravlennye_zajavki fetchotpravlennye_zajavki(
		long otpravlennye_zajavki_id) {
		return _otpravlennye_zajavkiLocalService.fetchotpravlennye_zajavki(otpravlennye_zajavki_id);
	}

	/**
	* Returns the otpravlennye_zajavki with the primary key.
	*
	* @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	* @return the otpravlennye_zajavki
	* @throws PortalException if a otpravlennye_zajavki with the primary key could not be found
	*/
	@Override
	public tj.otpravlennye.zajavki.model.otpravlennye_zajavki getotpravlennye_zajavki(
		long otpravlennye_zajavki_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _otpravlennye_zajavkiLocalService.getotpravlennye_zajavki(otpravlennye_zajavki_id);
	}

	/**
	* Updates the otpravlennye_zajavki in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param otpravlennye_zajavki the otpravlennye_zajavki
	* @return the otpravlennye_zajavki that was updated
	*/
	@Override
	public tj.otpravlennye.zajavki.model.otpravlennye_zajavki updateotpravlennye_zajavki(
		tj.otpravlennye.zajavki.model.otpravlennye_zajavki otpravlennye_zajavki) {
		return _otpravlennye_zajavkiLocalService.updateotpravlennye_zajavki(otpravlennye_zajavki);
	}

	@Override
	public otpravlennye_zajavkiLocalService getWrappedService() {
		return _otpravlennye_zajavkiLocalService;
	}

	@Override
	public void setWrappedService(
		otpravlennye_zajavkiLocalService otpravlennye_zajavkiLocalService) {
		_otpravlennye_zajavkiLocalService = otpravlennye_zajavkiLocalService;
	}

	private otpravlennye_zajavkiLocalService _otpravlennye_zajavkiLocalService;
}