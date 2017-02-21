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

package tj.goroda.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link gorodaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see gorodaLocalService
 * @generated
 */
@ProviderType
public class gorodaLocalServiceWrapper implements gorodaLocalService,
	ServiceWrapper<gorodaLocalService> {
	public gorodaLocalServiceWrapper(gorodaLocalService gorodaLocalService) {
		_gorodaLocalService = gorodaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _gorodaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _gorodaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _gorodaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _gorodaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _gorodaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of gorodas.
	*
	* @return the number of gorodas
	*/
	@Override
	public int getgorodasCount() {
		return _gorodaLocalService.getgorodasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _gorodaLocalService.getOSGiServiceIdentifier();
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
		return _gorodaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.goroda.model.impl.gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _gorodaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.goroda.model.impl.gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _gorodaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the gorodas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.goroda.model.impl.gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of gorodas
	* @param end the upper bound of the range of gorodas (not inclusive)
	* @return the range of gorodas
	*/
	@Override
	public java.util.List<tj.goroda.model.goroda> getgorodas(int start, int end) {
		return _gorodaLocalService.getgorodas(start, end);
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
		return _gorodaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _gorodaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the goroda to the database. Also notifies the appropriate model listeners.
	*
	* @param goroda the goroda
	* @return the goroda that was added
	*/
	@Override
	public tj.goroda.model.goroda addgoroda(tj.goroda.model.goroda goroda) {
		return _gorodaLocalService.addgoroda(goroda);
	}

	/**
	* Creates a new goroda with the primary key. Does not add the goroda to the database.
	*
	* @param goroda_id the primary key for the new goroda
	* @return the new goroda
	*/
	@Override
	public tj.goroda.model.goroda creategoroda(long goroda_id) {
		return _gorodaLocalService.creategoroda(goroda_id);
	}

	/**
	* Deletes the goroda with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param goroda_id the primary key of the goroda
	* @return the goroda that was removed
	* @throws PortalException if a goroda with the primary key could not be found
	*/
	@Override
	public tj.goroda.model.goroda deletegoroda(long goroda_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _gorodaLocalService.deletegoroda(goroda_id);
	}

	/**
	* Deletes the goroda from the database. Also notifies the appropriate model listeners.
	*
	* @param goroda the goroda
	* @return the goroda that was removed
	*/
	@Override
	public tj.goroda.model.goroda deletegoroda(tj.goroda.model.goroda goroda) {
		return _gorodaLocalService.deletegoroda(goroda);
	}

	@Override
	public tj.goroda.model.goroda fetchgoroda(long goroda_id) {
		return _gorodaLocalService.fetchgoroda(goroda_id);
	}

	/**
	* Returns the goroda with the primary key.
	*
	* @param goroda_id the primary key of the goroda
	* @return the goroda
	* @throws PortalException if a goroda with the primary key could not be found
	*/
	@Override
	public tj.goroda.model.goroda getgoroda(long goroda_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _gorodaLocalService.getgoroda(goroda_id);
	}

	/**
	* Updates the goroda in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param goroda the goroda
	* @return the goroda that was updated
	*/
	@Override
	public tj.goroda.model.goroda updategoroda(tj.goroda.model.goroda goroda) {
		return _gorodaLocalService.updategoroda(goroda);
	}

	@Override
	public gorodaLocalService getWrappedService() {
		return _gorodaLocalService;
	}

	@Override
	public void setWrappedService(gorodaLocalService gorodaLocalService) {
		_gorodaLocalService = gorodaLocalService;
	}

	private gorodaLocalService _gorodaLocalService;
}