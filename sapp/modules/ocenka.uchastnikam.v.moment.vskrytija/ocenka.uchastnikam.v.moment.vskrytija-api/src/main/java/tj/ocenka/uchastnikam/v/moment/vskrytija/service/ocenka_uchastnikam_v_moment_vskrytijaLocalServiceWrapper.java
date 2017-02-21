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

package tj.ocenka.uchastnikam.v.moment.vskrytija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ocenka_uchastnikam_v_moment_vskrytijaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ocenka_uchastnikam_v_moment_vskrytijaLocalService
 * @generated
 */
@ProviderType
public class ocenka_uchastnikam_v_moment_vskrytijaLocalServiceWrapper
	implements ocenka_uchastnikam_v_moment_vskrytijaLocalService,
		ServiceWrapper<ocenka_uchastnikam_v_moment_vskrytijaLocalService> {
	public ocenka_uchastnikam_v_moment_vskrytijaLocalServiceWrapper(
		ocenka_uchastnikam_v_moment_vskrytijaLocalService ocenka_uchastnikam_v_moment_vskrytijaLocalService) {
		_ocenka_uchastnikam_v_moment_vskrytijaLocalService = ocenka_uchastnikam_v_moment_vskrytijaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of ocenka_uchastnikam_v_moment_vskrytijas.
	*
	* @return the number of ocenka_uchastnikam_v_moment_vskrytijas
	*/
	@Override
	public int getocenka_uchastnikam_v_moment_vskrytijasCount() {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.getocenka_uchastnikam_v_moment_vskrytijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.getOSGiServiceIdentifier();
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
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the ocenka_uchastnikam_v_moment_vskrytijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ocenka_uchastnikam_v_moment_vskrytijas
	* @param end the upper bound of the range of ocenka_uchastnikam_v_moment_vskrytijas (not inclusive)
	* @return the range of ocenka_uchastnikam_v_moment_vskrytijas
	*/
	@Override
	public java.util.List<tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija> getocenka_uchastnikam_v_moment_vskrytijas(
		int start, int end) {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.getocenka_uchastnikam_v_moment_vskrytijas(start,
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
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the ocenka_uchastnikam_v_moment_vskrytija to the database. Also notifies the appropriate model listeners.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija the ocenka_uchastnikam_v_moment_vskrytija
	* @return the ocenka_uchastnikam_v_moment_vskrytija that was added
	*/
	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija addocenka_uchastnikam_v_moment_vskrytija(
		tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija ocenka_uchastnikam_v_moment_vskrytija) {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.addocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija);
	}

	/**
	* Creates a new ocenka_uchastnikam_v_moment_vskrytija with the primary key. Does not add the ocenka_uchastnikam_v_moment_vskrytija to the database.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija_id the primary key for the new ocenka_uchastnikam_v_moment_vskrytija
	* @return the new ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija createocenka_uchastnikam_v_moment_vskrytija(
		long ocenka_uchastnikam_v_moment_vskrytija_id) {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.createocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija_id);
	}

	/**
	* Deletes the ocenka_uchastnikam_v_moment_vskrytija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija_id the primary key of the ocenka_uchastnikam_v_moment_vskrytija
	* @return the ocenka_uchastnikam_v_moment_vskrytija that was removed
	* @throws PortalException if a ocenka_uchastnikam_v_moment_vskrytija with the primary key could not be found
	*/
	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija deleteocenka_uchastnikam_v_moment_vskrytija(
		long ocenka_uchastnikam_v_moment_vskrytija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.deleteocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija_id);
	}

	/**
	* Deletes the ocenka_uchastnikam_v_moment_vskrytija from the database. Also notifies the appropriate model listeners.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija the ocenka_uchastnikam_v_moment_vskrytija
	* @return the ocenka_uchastnikam_v_moment_vskrytija that was removed
	*/
	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija deleteocenka_uchastnikam_v_moment_vskrytija(
		tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija ocenka_uchastnikam_v_moment_vskrytija) {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.deleteocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija);
	}

	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija fetchocenka_uchastnikam_v_moment_vskrytija(
		long ocenka_uchastnikam_v_moment_vskrytija_id) {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.fetchocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija_id);
	}

	/**
	* Returns the ocenka_uchastnikam_v_moment_vskrytija with the primary key.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija_id the primary key of the ocenka_uchastnikam_v_moment_vskrytija
	* @return the ocenka_uchastnikam_v_moment_vskrytija
	* @throws PortalException if a ocenka_uchastnikam_v_moment_vskrytija with the primary key could not be found
	*/
	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija getocenka_uchastnikam_v_moment_vskrytija(
		long ocenka_uchastnikam_v_moment_vskrytija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.getocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija_id);
	}

	/**
	* Updates the ocenka_uchastnikam_v_moment_vskrytija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija the ocenka_uchastnikam_v_moment_vskrytija
	* @return the ocenka_uchastnikam_v_moment_vskrytija that was updated
	*/
	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija updateocenka_uchastnikam_v_moment_vskrytija(
		tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija ocenka_uchastnikam_v_moment_vskrytija) {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService.updateocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija);
	}

	@Override
	public ocenka_uchastnikam_v_moment_vskrytijaLocalService getWrappedService() {
		return _ocenka_uchastnikam_v_moment_vskrytijaLocalService;
	}

	@Override
	public void setWrappedService(
		ocenka_uchastnikam_v_moment_vskrytijaLocalService ocenka_uchastnikam_v_moment_vskrytijaLocalService) {
		_ocenka_uchastnikam_v_moment_vskrytijaLocalService = ocenka_uchastnikam_v_moment_vskrytijaLocalService;
	}

	private ocenka_uchastnikam_v_moment_vskrytijaLocalService _ocenka_uchastnikam_v_moment_vskrytijaLocalService;
}