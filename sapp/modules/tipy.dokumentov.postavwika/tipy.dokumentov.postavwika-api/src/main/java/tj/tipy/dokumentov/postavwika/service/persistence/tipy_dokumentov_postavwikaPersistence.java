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

package tj.tipy.dokumentov.postavwika.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.tipy.dokumentov.postavwika.exception.NoSuchtipy_dokumentov_postavwikaException;
import tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika;

/**
 * The persistence interface for the tipy_dokumentov_postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.tipy.dokumentov.postavwika.service.persistence.impl.tipy_dokumentov_postavwikaPersistenceImpl
 * @see tipy_dokumentov_postavwikaUtil
 * @generated
 */
@ProviderType
public interface tipy_dokumentov_postavwikaPersistence extends BasePersistence<tipy_dokumentov_postavwika> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link tipy_dokumentov_postavwikaUtil} to access the tipy_dokumentov_postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tipy_dokumentov_postavwika in the entity cache if it is enabled.
	*
	* @param tipy_dokumentov_postavwika the tipy_dokumentov_postavwika
	*/
	public void cacheResult(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika);

	/**
	* Caches the tipy_dokumentov_postavwikas in the entity cache if it is enabled.
	*
	* @param tipy_dokumentov_postavwikas the tipy_dokumentov_postavwikas
	*/
	public void cacheResult(
		java.util.List<tipy_dokumentov_postavwika> tipy_dokumentov_postavwikas);

	/**
	* Creates a new tipy_dokumentov_postavwika with the primary key. Does not add the tipy_dokumentov_postavwika to the database.
	*
	* @param tipy_dokumentov_postavwika_id the primary key for the new tipy_dokumentov_postavwika
	* @return the new tipy_dokumentov_postavwika
	*/
	public tipy_dokumentov_postavwika create(long tipy_dokumentov_postavwika_id);

	/**
	* Removes the tipy_dokumentov_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika that was removed
	* @throws NoSuchtipy_dokumentov_postavwikaException if a tipy_dokumentov_postavwika with the primary key could not be found
	*/
	public tipy_dokumentov_postavwika remove(long tipy_dokumentov_postavwika_id)
		throws NoSuchtipy_dokumentov_postavwikaException;

	public tipy_dokumentov_postavwika updateImpl(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika);

	/**
	* Returns the tipy_dokumentov_postavwika with the primary key or throws a {@link NoSuchtipy_dokumentov_postavwikaException} if it could not be found.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika
	* @throws NoSuchtipy_dokumentov_postavwikaException if a tipy_dokumentov_postavwika with the primary key could not be found
	*/
	public tipy_dokumentov_postavwika findByPrimaryKey(
		long tipy_dokumentov_postavwika_id)
		throws NoSuchtipy_dokumentov_postavwikaException;

	/**
	* Returns the tipy_dokumentov_postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika, or <code>null</code> if a tipy_dokumentov_postavwika with the primary key could not be found
	*/
	public tipy_dokumentov_postavwika fetchByPrimaryKey(
		long tipy_dokumentov_postavwika_id);

	@Override
	public java.util.Map<java.io.Serializable, tipy_dokumentov_postavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tipy_dokumentov_postavwikas.
	*
	* @return the tipy_dokumentov_postavwikas
	*/
	public java.util.List<tipy_dokumentov_postavwika> findAll();

	/**
	* Returns a range of all the tipy_dokumentov_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_dokumentov_postavwikas
	* @param end the upper bound of the range of tipy_dokumentov_postavwikas (not inclusive)
	* @return the range of tipy_dokumentov_postavwikas
	*/
	public java.util.List<tipy_dokumentov_postavwika> findAll(int start, int end);

	/**
	* Returns an ordered range of all the tipy_dokumentov_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_dokumentov_postavwikas
	* @param end the upper bound of the range of tipy_dokumentov_postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipy_dokumentov_postavwikas
	*/
	public java.util.List<tipy_dokumentov_postavwika> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<tipy_dokumentov_postavwika> orderByComparator);

	/**
	* Returns an ordered range of all the tipy_dokumentov_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_dokumentov_postavwikas
	* @param end the upper bound of the range of tipy_dokumentov_postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipy_dokumentov_postavwikas
	*/
	public java.util.List<tipy_dokumentov_postavwika> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<tipy_dokumentov_postavwika> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tipy_dokumentov_postavwikas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tipy_dokumentov_postavwikas.
	*
	* @return the number of tipy_dokumentov_postavwikas
	*/
	public int countAll();
}