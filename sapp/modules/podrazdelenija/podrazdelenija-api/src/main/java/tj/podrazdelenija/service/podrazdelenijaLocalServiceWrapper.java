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

package tj.podrazdelenija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link podrazdelenijaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see podrazdelenijaLocalService
 * @generated
 */
@ProviderType
public class podrazdelenijaLocalServiceWrapper
	implements podrazdelenijaLocalService,
		ServiceWrapper<podrazdelenijaLocalService> {
	public podrazdelenijaLocalServiceWrapper(
		podrazdelenijaLocalService podrazdelenijaLocalService) {
		_podrazdelenijaLocalService = podrazdelenijaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _podrazdelenijaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _podrazdelenijaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _podrazdelenijaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podrazdelenijaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podrazdelenijaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of podrazdelenijas.
	*
	* @return the number of podrazdelenijas
	*/
	@Override
	public int getpodrazdelenijasCount() {
		return _podrazdelenijaLocalService.getpodrazdelenijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _podrazdelenijaLocalService.getOSGiServiceIdentifier();
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
		return _podrazdelenijaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podrazdelenija.model.impl.podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _podrazdelenijaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podrazdelenija.model.impl.podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _podrazdelenijaLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the podrazdelenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podrazdelenija.model.impl.podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podrazdelenijas
	* @param end the upper bound of the range of podrazdelenijas (not inclusive)
	* @return the range of podrazdelenijas
	*/
	@Override
	public java.util.List<tj.podrazdelenija.model.podrazdelenija> getpodrazdelenijas(
		int start, int end) {
		return _podrazdelenijaLocalService.getpodrazdelenijas(start, end);
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
		return _podrazdelenijaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _podrazdelenijaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the podrazdelenija to the database. Also notifies the appropriate model listeners.
	*
	* @param podrazdelenija the podrazdelenija
	* @return the podrazdelenija that was added
	*/
	@Override
	public tj.podrazdelenija.model.podrazdelenija addpodrazdelenija(
		tj.podrazdelenija.model.podrazdelenija podrazdelenija) {
		return _podrazdelenijaLocalService.addpodrazdelenija(podrazdelenija);
	}

	/**
	* Creates a new podrazdelenija with the primary key. Does not add the podrazdelenija to the database.
	*
	* @param podrazdelenija_id the primary key for the new podrazdelenija
	* @return the new podrazdelenija
	*/
	@Override
	public tj.podrazdelenija.model.podrazdelenija createpodrazdelenija(
		long podrazdelenija_id) {
		return _podrazdelenijaLocalService.createpodrazdelenija(podrazdelenija_id);
	}

	/**
	* Deletes the podrazdelenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param podrazdelenija_id the primary key of the podrazdelenija
	* @return the podrazdelenija that was removed
	* @throws PortalException if a podrazdelenija with the primary key could not be found
	*/
	@Override
	public tj.podrazdelenija.model.podrazdelenija deletepodrazdelenija(
		long podrazdelenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podrazdelenijaLocalService.deletepodrazdelenija(podrazdelenija_id);
	}

	/**
	* Deletes the podrazdelenija from the database. Also notifies the appropriate model listeners.
	*
	* @param podrazdelenija the podrazdelenija
	* @return the podrazdelenija that was removed
	*/
	@Override
	public tj.podrazdelenija.model.podrazdelenija deletepodrazdelenija(
		tj.podrazdelenija.model.podrazdelenija podrazdelenija) {
		return _podrazdelenijaLocalService.deletepodrazdelenija(podrazdelenija);
	}

	@Override
	public tj.podrazdelenija.model.podrazdelenija fetchpodrazdelenija(
		long podrazdelenija_id) {
		return _podrazdelenijaLocalService.fetchpodrazdelenija(podrazdelenija_id);
	}

	/**
	* Returns the podrazdelenija with the primary key.
	*
	* @param podrazdelenija_id the primary key of the podrazdelenija
	* @return the podrazdelenija
	* @throws PortalException if a podrazdelenija with the primary key could not be found
	*/
	@Override
	public tj.podrazdelenija.model.podrazdelenija getpodrazdelenija(
		long podrazdelenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podrazdelenijaLocalService.getpodrazdelenija(podrazdelenija_id);
	}

	/**
	* Updates the podrazdelenija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param podrazdelenija the podrazdelenija
	* @return the podrazdelenija that was updated
	*/
	@Override
	public tj.podrazdelenija.model.podrazdelenija updatepodrazdelenija(
		tj.podrazdelenija.model.podrazdelenija podrazdelenija) {
		return _podrazdelenijaLocalService.updatepodrazdelenija(podrazdelenija);
	}

	@Override
	public podrazdelenijaLocalService getWrappedService() {
		return _podrazdelenijaLocalService;
	}

	@Override
	public void setWrappedService(
		podrazdelenijaLocalService podrazdelenijaLocalService) {
		_podrazdelenijaLocalService = podrazdelenijaLocalService;
	}

	private podrazdelenijaLocalService _podrazdelenijaLocalService;
}