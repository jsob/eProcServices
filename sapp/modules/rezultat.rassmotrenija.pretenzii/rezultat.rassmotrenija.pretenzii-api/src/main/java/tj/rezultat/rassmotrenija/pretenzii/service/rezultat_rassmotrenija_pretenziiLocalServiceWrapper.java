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

package tj.rezultat.rassmotrenija.pretenzii.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link rezultat_rassmotrenija_pretenziiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_rassmotrenija_pretenziiLocalService
 * @generated
 */
@ProviderType
public class rezultat_rassmotrenija_pretenziiLocalServiceWrapper
	implements rezultat_rassmotrenija_pretenziiLocalService,
		ServiceWrapper<rezultat_rassmotrenija_pretenziiLocalService> {
	public rezultat_rassmotrenija_pretenziiLocalServiceWrapper(
		rezultat_rassmotrenija_pretenziiLocalService rezultat_rassmotrenija_pretenziiLocalService) {
		_rezultat_rassmotrenija_pretenziiLocalService = rezultat_rassmotrenija_pretenziiLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _rezultat_rassmotrenija_pretenziiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rezultat_rassmotrenija_pretenziiLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _rezultat_rassmotrenija_pretenziiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rezultat_rassmotrenija_pretenziiLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rezultat_rassmotrenija_pretenziiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of rezultat_rassmotrenija_pretenziis.
	*
	* @return the number of rezultat_rassmotrenija_pretenziis
	*/
	@Override
	public int getrezultat_rassmotrenija_pretenziisCount() {
		return _rezultat_rassmotrenija_pretenziiLocalService.getrezultat_rassmotrenija_pretenziisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _rezultat_rassmotrenija_pretenziiLocalService.getOSGiServiceIdentifier();
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
		return _rezultat_rassmotrenija_pretenziiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.rezultat.rassmotrenija.pretenzii.model.impl.rezultat_rassmotrenija_pretenziiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rezultat_rassmotrenija_pretenziiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.rezultat.rassmotrenija.pretenzii.model.impl.rezultat_rassmotrenija_pretenziiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rezultat_rassmotrenija_pretenziiLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the rezultat_rassmotrenija_pretenziis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.rezultat.rassmotrenija.pretenzii.model.impl.rezultat_rassmotrenija_pretenziiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rezultat_rassmotrenija_pretenziis
	* @param end the upper bound of the range of rezultat_rassmotrenija_pretenziis (not inclusive)
	* @return the range of rezultat_rassmotrenija_pretenziis
	*/
	@Override
	public java.util.List<tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii> getrezultat_rassmotrenija_pretenziis(
		int start, int end) {
		return _rezultat_rassmotrenija_pretenziiLocalService.getrezultat_rassmotrenija_pretenziis(start,
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
		return _rezultat_rassmotrenija_pretenziiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _rezultat_rassmotrenija_pretenziiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the rezultat_rassmotrenija_pretenzii to the database. Also notifies the appropriate model listeners.
	*
	* @param rezultat_rassmotrenija_pretenzii the rezultat_rassmotrenija_pretenzii
	* @return the rezultat_rassmotrenija_pretenzii that was added
	*/
	@Override
	public tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii addrezultat_rassmotrenija_pretenzii(
		tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		return _rezultat_rassmotrenija_pretenziiLocalService.addrezultat_rassmotrenija_pretenzii(rezultat_rassmotrenija_pretenzii);
	}

	/**
	* Creates a new rezultat_rassmotrenija_pretenzii with the primary key. Does not add the rezultat_rassmotrenija_pretenzii to the database.
	*
	* @param rezultat_rassmotrenija_pretenzii_id the primary key for the new rezultat_rassmotrenija_pretenzii
	* @return the new rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii createrezultat_rassmotrenija_pretenzii(
		long rezultat_rassmotrenija_pretenzii_id) {
		return _rezultat_rassmotrenija_pretenziiLocalService.createrezultat_rassmotrenija_pretenzii(rezultat_rassmotrenija_pretenzii_id);
	}

	/**
	* Deletes the rezultat_rassmotrenija_pretenzii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rezultat_rassmotrenija_pretenzii_id the primary key of the rezultat_rassmotrenija_pretenzii
	* @return the rezultat_rassmotrenija_pretenzii that was removed
	* @throws PortalException if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	*/
	@Override
	public tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii deleterezultat_rassmotrenija_pretenzii(
		long rezultat_rassmotrenija_pretenzii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rezultat_rassmotrenija_pretenziiLocalService.deleterezultat_rassmotrenija_pretenzii(rezultat_rassmotrenija_pretenzii_id);
	}

	/**
	* Deletes the rezultat_rassmotrenija_pretenzii from the database. Also notifies the appropriate model listeners.
	*
	* @param rezultat_rassmotrenija_pretenzii the rezultat_rassmotrenija_pretenzii
	* @return the rezultat_rassmotrenija_pretenzii that was removed
	*/
	@Override
	public tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii deleterezultat_rassmotrenija_pretenzii(
		tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		return _rezultat_rassmotrenija_pretenziiLocalService.deleterezultat_rassmotrenija_pretenzii(rezultat_rassmotrenija_pretenzii);
	}

	@Override
	public tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii fetchrezultat_rassmotrenija_pretenzii(
		long rezultat_rassmotrenija_pretenzii_id) {
		return _rezultat_rassmotrenija_pretenziiLocalService.fetchrezultat_rassmotrenija_pretenzii(rezultat_rassmotrenija_pretenzii_id);
	}

	/**
	* Returns the rezultat_rassmotrenija_pretenzii with the primary key.
	*
	* @param rezultat_rassmotrenija_pretenzii_id the primary key of the rezultat_rassmotrenija_pretenzii
	* @return the rezultat_rassmotrenija_pretenzii
	* @throws PortalException if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	*/
	@Override
	public tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii getrezultat_rassmotrenija_pretenzii(
		long rezultat_rassmotrenija_pretenzii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rezultat_rassmotrenija_pretenziiLocalService.getrezultat_rassmotrenija_pretenzii(rezultat_rassmotrenija_pretenzii_id);
	}

	/**
	* Updates the rezultat_rassmotrenija_pretenzii in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rezultat_rassmotrenija_pretenzii the rezultat_rassmotrenija_pretenzii
	* @return the rezultat_rassmotrenija_pretenzii that was updated
	*/
	@Override
	public tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii updaterezultat_rassmotrenija_pretenzii(
		tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		return _rezultat_rassmotrenija_pretenziiLocalService.updaterezultat_rassmotrenija_pretenzii(rezultat_rassmotrenija_pretenzii);
	}

	@Override
	public rezultat_rassmotrenija_pretenziiLocalService getWrappedService() {
		return _rezultat_rassmotrenija_pretenziiLocalService;
	}

	@Override
	public void setWrappedService(
		rezultat_rassmotrenija_pretenziiLocalService rezultat_rassmotrenija_pretenziiLocalService) {
		_rezultat_rassmotrenija_pretenziiLocalService = rezultat_rassmotrenija_pretenziiLocalService;
	}

	private rezultat_rassmotrenija_pretenziiLocalService _rezultat_rassmotrenija_pretenziiLocalService;
}