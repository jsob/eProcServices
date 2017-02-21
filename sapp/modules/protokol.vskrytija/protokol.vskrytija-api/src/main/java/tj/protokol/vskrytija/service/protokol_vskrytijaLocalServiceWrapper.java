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

package tj.protokol.vskrytija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link protokol_vskrytijaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_vskrytijaLocalService
 * @generated
 */
@ProviderType
public class protokol_vskrytijaLocalServiceWrapper
	implements protokol_vskrytijaLocalService,
		ServiceWrapper<protokol_vskrytijaLocalService> {
	public protokol_vskrytijaLocalServiceWrapper(
		protokol_vskrytijaLocalService protokol_vskrytijaLocalService) {
		_protokol_vskrytijaLocalService = protokol_vskrytijaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _protokol_vskrytijaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _protokol_vskrytijaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _protokol_vskrytijaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_vskrytijaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_vskrytijaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of protokol_vskrytijas.
	*
	* @return the number of protokol_vskrytijas
	*/
	@Override
	public int getprotokol_vskrytijasCount() {
		return _protokol_vskrytijaLocalService.getprotokol_vskrytijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _protokol_vskrytijaLocalService.getOSGiServiceIdentifier();
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
		return _protokol_vskrytijaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.vskrytija.model.impl.protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _protokol_vskrytijaLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.vskrytija.model.impl.protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _protokol_vskrytijaLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the protokol_vskrytijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.vskrytija.model.impl.protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_vskrytijas
	* @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	* @return the range of protokol_vskrytijas
	*/
	@Override
	public java.util.List<tj.protokol.vskrytija.model.protokol_vskrytija> getprotokol_vskrytijas(
		int start, int end) {
		return _protokol_vskrytijaLocalService.getprotokol_vskrytijas(start, end);
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
		return _protokol_vskrytijaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _protokol_vskrytijaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the protokol_vskrytija to the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_vskrytija the protokol_vskrytija
	* @return the protokol_vskrytija that was added
	*/
	@Override
	public tj.protokol.vskrytija.model.protokol_vskrytija addprotokol_vskrytija(
		tj.protokol.vskrytija.model.protokol_vskrytija protokol_vskrytija) {
		return _protokol_vskrytijaLocalService.addprotokol_vskrytija(protokol_vskrytija);
	}

	/**
	* Creates a new protokol_vskrytija with the primary key. Does not add the protokol_vskrytija to the database.
	*
	* @param protokol_vskrytija_id the primary key for the new protokol_vskrytija
	* @return the new protokol_vskrytija
	*/
	@Override
	public tj.protokol.vskrytija.model.protokol_vskrytija createprotokol_vskrytija(
		long protokol_vskrytija_id) {
		return _protokol_vskrytijaLocalService.createprotokol_vskrytija(protokol_vskrytija_id);
	}

	/**
	* Deletes the protokol_vskrytija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	* @return the protokol_vskrytija that was removed
	* @throws PortalException if a protokol_vskrytija with the primary key could not be found
	*/
	@Override
	public tj.protokol.vskrytija.model.protokol_vskrytija deleteprotokol_vskrytija(
		long protokol_vskrytija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_vskrytijaLocalService.deleteprotokol_vskrytija(protokol_vskrytija_id);
	}

	/**
	* Deletes the protokol_vskrytija from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_vskrytija the protokol_vskrytija
	* @return the protokol_vskrytija that was removed
	*/
	@Override
	public tj.protokol.vskrytija.model.protokol_vskrytija deleteprotokol_vskrytija(
		tj.protokol.vskrytija.model.protokol_vskrytija protokol_vskrytija) {
		return _protokol_vskrytijaLocalService.deleteprotokol_vskrytija(protokol_vskrytija);
	}

	@Override
	public tj.protokol.vskrytija.model.protokol_vskrytija fetchprotokol_vskrytija(
		long protokol_vskrytija_id) {
		return _protokol_vskrytijaLocalService.fetchprotokol_vskrytija(protokol_vskrytija_id);
	}

	/**
	* Returns the protokol_vskrytija with the primary key.
	*
	* @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	* @return the protokol_vskrytija
	* @throws PortalException if a protokol_vskrytija with the primary key could not be found
	*/
	@Override
	public tj.protokol.vskrytija.model.protokol_vskrytija getprotokol_vskrytija(
		long protokol_vskrytija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_vskrytijaLocalService.getprotokol_vskrytija(protokol_vskrytija_id);
	}

	/**
	* Updates the protokol_vskrytija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protokol_vskrytija the protokol_vskrytija
	* @return the protokol_vskrytija that was updated
	*/
	@Override
	public tj.protokol.vskrytija.model.protokol_vskrytija updateprotokol_vskrytija(
		tj.protokol.vskrytija.model.protokol_vskrytija protokol_vskrytija) {
		return _protokol_vskrytijaLocalService.updateprotokol_vskrytija(protokol_vskrytija);
	}

	@Override
	public protokol_vskrytijaLocalService getWrappedService() {
		return _protokol_vskrytijaLocalService;
	}

	@Override
	public void setWrappedService(
		protokol_vskrytijaLocalService protokol_vskrytijaLocalService) {
		_protokol_vskrytijaLocalService = protokol_vskrytijaLocalService;
	}

	private protokol_vskrytijaLocalService _protokol_vskrytijaLocalService;
}