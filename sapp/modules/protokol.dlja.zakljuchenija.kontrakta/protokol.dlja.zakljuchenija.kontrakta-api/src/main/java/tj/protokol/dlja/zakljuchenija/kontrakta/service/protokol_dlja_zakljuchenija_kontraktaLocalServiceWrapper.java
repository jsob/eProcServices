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

package tj.protokol.dlja.zakljuchenija.kontrakta.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link protokol_dlja_zakljuchenija_kontraktaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_dlja_zakljuchenija_kontraktaLocalService
 * @generated
 */
@ProviderType
public class protokol_dlja_zakljuchenija_kontraktaLocalServiceWrapper
	implements protokol_dlja_zakljuchenija_kontraktaLocalService,
		ServiceWrapper<protokol_dlja_zakljuchenija_kontraktaLocalService> {
	public protokol_dlja_zakljuchenija_kontraktaLocalServiceWrapper(
		protokol_dlja_zakljuchenija_kontraktaLocalService protokol_dlja_zakljuchenija_kontraktaLocalService) {
		_protokol_dlja_zakljuchenija_kontraktaLocalService = protokol_dlja_zakljuchenija_kontraktaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of protokol_dlja_zakljuchenija_kontraktas.
	*
	* @return the number of protokol_dlja_zakljuchenija_kontraktas
	*/
	@Override
	public int getprotokol_dlja_zakljuchenija_kontraktasCount() {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.getprotokol_dlja_zakljuchenija_kontraktasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.getOSGiServiceIdentifier();
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
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.dlja.zakljuchenija.kontrakta.model.impl.protokol_dlja_zakljuchenija_kontraktaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.dlja.zakljuchenija.kontrakta.model.impl.protokol_dlja_zakljuchenija_kontraktaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the protokol_dlja_zakljuchenija_kontraktas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.dlja.zakljuchenija.kontrakta.model.impl.protokol_dlja_zakljuchenija_kontraktaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_dlja_zakljuchenija_kontraktas
	* @param end the upper bound of the range of protokol_dlja_zakljuchenija_kontraktas (not inclusive)
	* @return the range of protokol_dlja_zakljuchenija_kontraktas
	*/
	@Override
	public java.util.List<tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta> getprotokol_dlja_zakljuchenija_kontraktas(
		int start, int end) {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.getprotokol_dlja_zakljuchenija_kontraktas(start,
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
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the protokol_dlja_zakljuchenija_kontrakta to the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta that was added
	*/
	@Override
	public tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta addprotokol_dlja_zakljuchenija_kontrakta(
		tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.addprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta);
	}

	/**
	* Creates a new protokol_dlja_zakljuchenija_kontrakta with the primary key. Does not add the protokol_dlja_zakljuchenija_kontrakta to the database.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the primary key for the new protokol_dlja_zakljuchenija_kontrakta
	* @return the new protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta createprotokol_dlja_zakljuchenija_kontrakta(
		long protokol_dlja_zakljuchenija_kontrakta_id) {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.createprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Deletes the protokol_dlja_zakljuchenija_kontrakta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the primary key of the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta that was removed
	* @throws PortalException if a protokol_dlja_zakljuchenija_kontrakta with the primary key could not be found
	*/
	@Override
	public tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta deleteprotokol_dlja_zakljuchenija_kontrakta(
		long protokol_dlja_zakljuchenija_kontrakta_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.deleteprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Deletes the protokol_dlja_zakljuchenija_kontrakta from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta that was removed
	*/
	@Override
	public tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta deleteprotokol_dlja_zakljuchenija_kontrakta(
		tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.deleteprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta);
	}

	@Override
	public tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta fetchprotokol_dlja_zakljuchenija_kontrakta(
		long protokol_dlja_zakljuchenija_kontrakta_id) {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.fetchprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Returns the protokol_dlja_zakljuchenija_kontrakta with the primary key.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the primary key of the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta
	* @throws PortalException if a protokol_dlja_zakljuchenija_kontrakta with the primary key could not be found
	*/
	@Override
	public tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta getprotokol_dlja_zakljuchenija_kontrakta(
		long protokol_dlja_zakljuchenija_kontrakta_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.getprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Updates the protokol_dlja_zakljuchenija_kontrakta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta that was updated
	*/
	@Override
	public tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta updateprotokol_dlja_zakljuchenija_kontrakta(
		tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService.updateprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta);
	}

	@Override
	public protokol_dlja_zakljuchenija_kontraktaLocalService getWrappedService() {
		return _protokol_dlja_zakljuchenija_kontraktaLocalService;
	}

	@Override
	public void setWrappedService(
		protokol_dlja_zakljuchenija_kontraktaLocalService protokol_dlja_zakljuchenija_kontraktaLocalService) {
		_protokol_dlja_zakljuchenija_kontraktaLocalService = protokol_dlja_zakljuchenija_kontraktaLocalService;
	}

	private protokol_dlja_zakljuchenija_kontraktaLocalService _protokol_dlja_zakljuchenija_kontraktaLocalService;
}