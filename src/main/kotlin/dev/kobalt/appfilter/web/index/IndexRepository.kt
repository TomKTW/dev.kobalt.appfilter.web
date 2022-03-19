/*
 * dev.kobalt.appfilter
 * Copyright (C) 2022 Tom.K
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package dev.kobalt.appfilter.web.index

import dev.kobalt.appfilter.web.about.AboutRepository
import dev.kobalt.appfilter.web.download.DownloadRepository
import dev.kobalt.appfilter.web.legal.LegalRepository
import dev.kobalt.appfilter.web.source.SourceRepository

object IndexRepository {

    val pageTitle = "Index"
    val pageSubtitle = "Search through apps on Google Play Store from appfilter.net database."

    val pageLinks = listOf(
        Triple(AboutRepository.pageRoute, AboutRepository.pageTitle, AboutRepository.pageSubtitle),
        Triple(DownloadRepository.pageRoute, DownloadRepository.pageTitle, DownloadRepository.pageSubtitle),
        Triple(SourceRepository.pageRoute, SourceRepository.pageTitle, SourceRepository.pageSubtitle),
        Triple(LegalRepository.pageRoute, LegalRepository.pageTitle, LegalRepository.pageSubtitle)
    )

}